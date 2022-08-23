package com.test;

import com.config.ConstructorMessageConfig;
import com.config.MessageConfig;
import com.model.Message;
import com.service.Communication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=null;

        try{
            context= new AnnotationConfigApplicationContext(MessageConfig.class);

           Message message= context.getBean("getMessage", Message.class);
            System.out.println(message);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        finally {
            if (context!=null)
                context.close();
        }

        AnnotationConfigApplicationContext annotationConfigApplicationContext=null;

        try {

            annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConstructorMessageConfig.class);
            Communication communication = annotationConfigApplicationContext.getBean("communication",
                    Communication.class);

            communication.communicate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        finally {
            if(annotationConfigApplicationContext!=null)

                annotationConfigApplicationContext.close();
        }


    }
}
