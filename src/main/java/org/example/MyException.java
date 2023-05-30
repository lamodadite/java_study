package org.example;

public class MyException extends Exception{
    // 에러 코드 값을 저장하기 위한 필드 추가
    private final int ERR_CODE; // 생성자를 통해 초기화 한다.

    MyException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    MyException(String msg) {
        this(msg, 100); // 에러코드를 100으로 초기화
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }
}
