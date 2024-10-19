package JavaKnowledge.Enum;

import lombok.Getter;

/**
 * ClassName:S
 * Description:
 *
 * @Date:2024/9/26 17:31
 * @Author: 李威威
 */
@Getter
public enum Season2 {


    SPRING("1","春天"),
    SUMMER("2","夏天"),
    AUTUMN("3","秋天"),
    WINTER("4","冬天");

    private final String code;
    private final String name;



    private Season2(String code,String name){
        this.code=code;
        this.name=name;
    }


    public static Season2 valueOfs(String code) {
        for (Season2 season2 : Season2.values()) {
            if (season2.getCode() == code) {
                return season2;
            }
        }
        return null;
    }

    }