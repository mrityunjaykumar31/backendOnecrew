package com.assesemnetApp.assesemnetApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.sql.Timestamp;
import java.util.Date;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;

@Service
public class PdfGeneratorService {
    private final TemplateEngine templateEngine;

   
    @Autowired
    public PdfGeneratorService(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public byte[] generatePdf(String title, String content, Object student, Date date) throws Exception {
    	
     
        Context context = new Context();
        context.setVariable("title", "mk");
        context.setVariable("content", content);
        context.setVariable("skill", "testsssss");
        context.setVariable("student", student);
        context.setVariable("examTime", date );

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

