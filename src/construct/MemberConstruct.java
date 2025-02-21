package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;
    
    /*
        생성자: 객체생성하자마자 초기화 사용 지원
                반환타입없음
                생성자명 = 클래스명
     */
    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " , age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
