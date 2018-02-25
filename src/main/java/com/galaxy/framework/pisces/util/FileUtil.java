package com.galaxy.framework.pisces.util;

import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;

public class FileUtil {

    /**
     * 64位图片写入存储s
     * @param source
     * @param category
     * @param target
     * @return
     * @throws IOException
     */
    public static String writeFromBase64(String source, String category, String target) throws IOException {
        String header = source.split(",")[0];
        String image = source.split(",")[1];
        String info = header.split(";")[0];
        String extendName = info.split("/")[1];

        Properties props = System.getProperties();
        byte[] imageByte = Base64.decodeBase64(image);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageByte);
        Path rootLocation = Paths.get(props.getProperty("user.home") + "/" + category + "/");
        String fileName = target + "." + extendName;
        Files.copy(byteArrayInputStream, rootLocation.resolve(fileName),
                StandardCopyOption.REPLACE_EXISTING);
        return fileName;
    }
}
