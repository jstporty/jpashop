package jpabook.jpashop.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateItemDto {

    private String name;
    private int price;
    private int stockQUantity;
    
    //사용 안함 ㅋ
}
