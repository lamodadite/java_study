package org.example.ch08;

import java.io.File;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            File f = createFile(name);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }
        File f = new File(fileName); // File클래스의 객체 만들기
        f.createNewFile();
        return f; // 생성된 객체의 참조를 반환
    }
}
