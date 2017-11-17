package Generated;
public class Program
{
   public static void main (String argv[])
   {
      Gently.JavaLib.SaveProgramArguments(argv);
      try {
         Generated.Procs.Start();
      }
      catch (Error E) {
         Gently.Message.ProgramError(E);
      }
   }
}
