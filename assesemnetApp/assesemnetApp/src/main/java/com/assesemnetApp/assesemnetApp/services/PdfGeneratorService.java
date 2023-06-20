package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.Date;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.itextpdf.text.pdf.parser.clipper.Paths;

import java.io.ByteArrayOutputStream;

import org.apache.tomcat.util.codec.binary.Base64;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;

@Service
public class PdfGeneratorService {
    private final TemplateEngine templateEngine;

   
    @Autowired
    public PdfGeneratorService(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public byte[] generatePdf(String title, String content, Object student, Date date) throws Exception {
    	   // Create a dataset with sample data
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 25);
        dataset.setValue("Category 2", 50);
        dataset.setValue("Category 3", 75);

        // Create the chart
       /* JFreeChart chart = ChartFactory.createPieChart("Sample Pie Chart", dataset, true, true, false);
        System.out.print(chart);

       String desktopPath = System.getProperty("user.home") + "/OneDrive/Desktop";
      String imagePath = desktopPath + "/chart.png";

       ChartUtils.saveChartAsPNG(new File(imagePath), chart, 500, 300);
       byte[] imageBytes = Files.readAllBytes(imagePath)
     //   String base64Image = Base64.encodeBase64String(imageBytes);*/
     
        Context context = new Context();
        context.setVariable("title", "mk");
        context.setVariable("content", content);
        context.setVariable("skill", "testsssss");
        context.setVariable("student", student);
        context.setVariable("examTime", date );
      //  context.setVariable("chart", chart );

        String html = templateEngine.process("template", context);
       // System.out.println(html);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(html);
        renderer.layout();
        renderer.createPDF(outputStream);
        renderer.finishPDF();

        return outputStream.toByteArray();
    }
}

