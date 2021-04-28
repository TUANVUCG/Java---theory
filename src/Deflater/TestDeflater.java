package Deflater;

import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class TestDeflater {
    public static void main(String[] args) {
        String input = "The Deflater class compress the data : Java là ngôn ngữ lập trình máy tính có tính chất hướng đối tượng, dựa trên các lớp, thường được sử dụng cho các hệ thống có tính độc lập cao. Nó được sử dụng để hướng tới các lập trình viên viết ứng dụng \"write one, run everywhere\" \n" +
                "Nội dung bài giảng:\n" +
                "1. exception + debug + package\n" +
                "http://bit.ly/2Z7rEh6\u200B\n" +
                "\n" +
                "2. Tìm hiểu collections, Sets, Maps và Generic \n" +
                "http://bit.ly/33ImWK6\u200B\n" +
                "\n" +
                "3.  Hướng dẫn đọc ghi file FileInputStream, FileOutputStream, ObjectInputSt...\n" +
                "http://bit.ly/31OTgJO\u200B\n" +
                "\n" +
                "4. Tìm hiểu Thread - Phân 1 \n" +
                "http://bit.ly/30dQcGI\u200B\n" +
                "\n" +
                "5. Tìm hiểu Thread trong Java - Phần 2\n" +
                "http://bit.ly/2Mrfg9Q\u200B\n" +
                "\n" +
                "6. Tìm hiểu Thread trong java - Phần 3\n" +
                "http://bit.ly/2Z9YuOh\u200B\n" +
                "\n" +
                "7. dong bo thread + wait notify + synchronized + Lập trình Java \n" +
                "http://bit.ly/2TJjg6e\u200B\n" +
                "\n" +
                "8. giai thich synchronized + Lap trinh Java nang cao\n" +
                "http://bit.ly/2Zhr0BG\u200B\n" +
                "\n" +
                "9. Ket noi MySQL trong java swing JDBC trong java \n" +
                "http://bit.ly/2Pdb13I\u200B\n" +
                "\n" +
                "10. Kết nối CSDL bằng java swing phần 2\n" +
                "http://bit.ly/2MprM9M\u200B\n" +
                "\n" +
                "11. Design Pattern Lap trinh Java nang cao\n" +
                "http://bit.ly/2ZflK1E\u200B\n" +
                "\n" +
                "12. chuyen doi json sang object java (sử dụng thư viện gson)\n" +
                "http://bit.ly/2P4KyFD\u200B\n" +
                "\n" +
                "Thực hành:\n" +
                "1. chua bai tap ObjectOutputStream & ObjectInputStream\n" +
                "http://bit.ly/2YXB3fX\u200B\n" +
                "\n" +
                "2. Chua bai tap Thread \n" +
                "http://bit.ly/2P2KnKQ\u200B\n" +
                "\n" +
                "3. Chữa bài tập hiển thị đồng bộ Thông tin tên & địa chỉ trên 2 thread khác nhau\n" +
                "http://bit.ly/2KT03eC\u200B\n" +
                "\n" +
                "4. chữa bài tập quản lý bán vé máy bay\n" +
                "http://bit.ly/2z99v88\u200B\n" +
                "\n" +
                "5. Bài tập quản lý sở thú - Phần 1\n" +
                "http://bit.ly/2Pdblzs\u200B\n" +
                "\n" +
                "6. Bài tập quản lý sở thú - Phần 2\n" +
                "http://bit.ly/2H8zQaP\u200B\n" +
                "\n" +
                "7.  Hướng dẫn chữa bài tập JDBC - quản lý sinh viên\n" +
                "http://bit.ly/2ZdjNmb\u200B\n" +
                "\n" +
                "8. quan ly san pham + 2 bang danh muc & san pham + Lập trình java nâng cao\n" +
                "http://bit.ly/31PD3Um\u200B\n" +
                "\n" +
                "9. Ứng dụng quản lý sinh viên - nhập dữ liệu từ file json\n" +
                "http://bit.ly/2YYZlX9\u200B\n" +
                "\n" +
                "10.  Lập trình java nâng cao - chữa bài tập tổng quát 181\n" +
                "http://bit.ly/2MpzLUa\u200B\n";
        System.out.println("Length : "+input.length());
        byte[] inputObj = input.getBytes(StandardCharsets.UTF_8);


        // Nen file
        byte[] output = new byte[1024];
        Deflater deflater = new Deflater();
        deflater.setInput(inputObj);
        deflater.finish();

        int compressDataLength = deflater.deflate(output);
        System.out.println(compressDataLength);
        System.out.println(new String(output,0,compressDataLength));

        // Giai nen :
        Inflater inflater = new Inflater();
        inflater.setInput(output,0,output.length);
        int resultLength =0;
        byte[] result = new byte[10000];
        try {
            resultLength = inflater.inflate(result);
            inflater.end();
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
        String outputResult = new String(result,0,resultLength );
        System.out.println(outputResult);
    }
}
