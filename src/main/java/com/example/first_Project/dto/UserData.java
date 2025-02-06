package com.example.first_Project.dto;


import lombok.*;

@AllArgsConstructor
@Data

public class UserData {
    private String userName;
    private int userAge;
    private String userAddress;

    public UserData(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public UserData() {
        this.userName = userName;
        this.userAge = userAge;
    }


    //    @AllArgsConstructor
//   public UserData(String userName, int userAge, String userAddress) {
//       this.userName = userName;
//       this.userAge = userAge;
//       this.userAddress = userAddress;
//    } == @AllArgsConstructor 이거랑 같은 의미이다. 롬복의 기능 설명.

//    @NoArgsConstructor 은 기본생성자를 생성하는 롬복의 기능이다.
//    public String userData(){} 와 같은 의미

//    @RequiredArgsConstructor
//    public UserData(String userName, int userAge){
//        this.userName;
//        this.userAge;
//    } == @RequiredArgsConstructor 와 같은의미 2개또는 한개의 인자만 가지고 싶을 때 사용(필요한 인자들만 갖는 생성자)

//    @Getter
//    @Setter
//    @Data (getter, setter , RequiredArgsConstructor, toString, EqualsAndHashCode) 이 전부 들어가있는 종합선물세트
//    @ToString
//    @EqualsAndHashCode

//    위 기능들은 lombok의 어노테이션만 넣으면 긴 코드가 필요없이 저렇게만 위에 지정해주면 코드가 간결해진다.
}
