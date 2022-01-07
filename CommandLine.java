public class CommandLine {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println("args[" + i + "] : " + args[i]);
    }
  }
}

/*
Что бы проверить даный код на практике нужно в командной строке
прописать следующее:

C:\Users\Roman\IdeaProjects\Shild-s_Book_Codes>
java CommandLine.java This is test of program 100 and -1

Как результат должно быть:

args[0] : This
args[1] : is
args[2] : test
args[3] : of
args[4] : program
args[5] : 100
args[6] : and
args[7] : -1

 */