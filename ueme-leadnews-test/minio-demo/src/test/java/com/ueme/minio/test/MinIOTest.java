package com.ueme.minio.test;

import com.ueme.file.service.FileStorageService;
import com.ueme.minio.MinIOApplication;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest(classes = MinIOApplication.class)
@RunWith(SpringRunner.class)
public class MinIOTest {


//    public static void main(String[] args) {
//
//        FileInputStream fileInputStream = null;
//        try {
//
//            fileInputStream =  new FileInputStream("D:\\list.html");;
//
//            //1.创建minio链接客户端
//            MinioClient minioClient = MinioClient.builder().credentials("admin", "admin123456").endpoint("http://10.10.1.198:9000").build();
//            //2.上传
//            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
//                    .object("list.html")//文件名
//                    .contentType("text/html")//文件类型
//                    .bucket("leadnews")//桶名词  与minio创建的名词一致
//                    .stream(fileInputStream, fileInputStream.available(), -1) //文件流
//                    .build();
//            minioClient.putObject(putObjectArgs);
//
//            System.out.println("http://10.10.1.198:9000/leadnews/list.html");
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }

    @Autowired
    private FileStorageService fileStorageService;

    @Test
    public void testUpdateImgFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\M730\\OneDrive - 广州环球自行车工业有限公司\\图片\\本机照片\\三层架构.JPG");
            String filePath = fileStorageService.uploadImgFile("", "Spring三层架构.JPG", fileInputStream);
            System.out.println(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
