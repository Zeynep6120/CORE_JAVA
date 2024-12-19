package d28exception_enum;

public class ExcepitonRunner {
    public static void main(String[] args) {

        studentGrade(-55);

    }//main dışı

    public static void studentGrade(int not){
       // System.out.println(not);

        if(not<0 || not>100){
            try {
                throw new InvalidStudentGradeException("Öğrenci notu sıfıran küçük veya yüzden büyük girilemz");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(not);
        }
        //throw new InvalidStudentGradeException("Öğrenci notu sıfıran küçük veya yüzden büyük girilemz");
        //ilk başta burda hata ooluştu çünkü biz extdens expetion  yazınca bu compile time s da oluşut.compile timex
        //da yazarken bunu çöz demektir. yani daha yazarken hatayı gösteriyor.yani kodu çalıitırmadan hatayı görüyoruz
    }
}
