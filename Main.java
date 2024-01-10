import Problem.IProblem;
import Problem.JobShopSchedulingProblem;
import Problem.MapColoringProblem;
import Problem.NQueenProblem;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    //reand and get file first line so it goes to corresponding problem, if not correct then there is error
    public static IProblem getProblem(String fileName) {
        IProblem problem;
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str = in.readLine();
            in.close();
            if (str.equals("map")) {
                problem = new MapColoringProblem(fileName);
            } else if (str.equals("jobshop")) {
                problem = new JobShopSchedulingProblem(fileName);
            } else
                problem = null;
        } catch (Exception e) {
            System.err.println("open file " + fileName + " error!!!");
            return null;
        }
        return problem;
    }
    
    // tell you how to run the program
    public static void printUsage() {
        System.out.println("Once you are in the src directoyr, type 'javac Main.java' in your terminal first");
        System.out.println("If you want to solve Australia Map Coloring Problem, type 'java Main.java -file MapColoringProblem.txt'");
        System.out.println("If you want to solve Job Scheduling Problem, type 'java Main.java -file job_shop_csp.txt'");
        System.out.println("If you want to solve NQueen Problem, type 'java Main.java -queen n', where n should be a positive integer");
    }
    
    //solve and print the solution, you can either choose input file like txt for map and jobshop, or you can choose queen
    public static void main(String[] args) {
        IProblem problem = null;
        if (args.length == 0) {
            printUsage();
        }
        for (int i = 0; i < args.length; i++) {
            switch (args[i].toLowerCase()) {
                //for txt file problem such as map coloring and job shop
                case "-file":
                    problem = getProblem(args[++i]);
                    if (problem == null) {
                        System.err.println("choose a problem!!!");
                        return;
                    }
                    break;
                case "-queen":
                //for nqueen problem
                //no solution if n=0,1,2,3
                    int N = Integer.parseInt(args[++i]);
                	if(N < 4) {
                		System.out.println("No Solution");
                	}
                	else {
                        problem = new NQueenProblem(N);
                	}
                    break;
            }
        }    
        if (problem == null) {
            return;
        }
        problem.solve();
        problem.printSolution();        
    }
}
   