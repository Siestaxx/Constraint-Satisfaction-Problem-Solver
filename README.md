# Constraint-Satisfaction-Problem-Solver

Main.java: When you run, it will tell you how to use this project, and also solve and print the solution.

Variable Folder:
Domain.java: Get the domains of the CSP problem, construct each domain type for the problems and use iterator on it.
Solution.java: Get the solution and make them to the form that is required on the requirement
Value.java: Construct the value type string and value
Variable.java: Construct each variable type for each problem, and check and get the whether assigned and the value assigned.

Solver Folder:
Solver.java: This is the backtracking algorithm.
ISolver.java: Interface for solver using backtracking algorithm.
Problem Folder:
IProblem.java: Interface for following problem, include print solution, solve and read instance. JobSchedulingProblem.java: It reads the job shop scheduling’s txt file according to the format. It puts each line corresponding to teacher’s requirement into variable, domain, also add constraints to those according to the “before” and “disjoint” in file.
MapColoringProblem.java: It reads the map coloring’s txt file according to the format. It puts each line corresponding to teacher’s requirement into variable, domain, also add constraints to those according to the = and != in file.
NQueenProblem.java: It creates the nqueen problem, including get domain and variable of the teacher’s request format, as well as add constraints, also print solution in the correct format.
Problem.java: Combines all the part in the CSP problem.

Constraint Folder:
IConstraint.java: Interface of constraints consisting isConsistency and isRelatedToVariable. BinaryConstraint.java: It is the binary constraint, so it has two variables x and y. It also checks if the constraint is related to the variable.
UnaryConstraint.java: It is the unary constraint, so it only has one variable x. It also checks if the constraint is related to the variable.
CapacityConstraint.java: It is used in the Job Shop Scheduling problem. It add and check consistency of the constraint of the work “before” in the txt file.
PrecedenceConstraint.java: It is used in the Job Shop Scheduling problem. It add and check consistency of the constraint of the work “disjoint” in the txt file.
VariableDiffFromVariableConstraint.java: It’s used in the Queen Problem and the Map Coloring Problem. In NQueen problem, it check and add the constraint that whether two queens are in the same row. In Map Coloring Problem, it check and add the constraint that the adjacent two should be different from each other. VariableMustEqualXConstraint.java: It is used in the Map Coloring Problem. It is used to get "=" constraint in the map problem and check consistency. In the context, it means the constraint is that a certain state has a certain color assigned in the file in the problem constraint. VariableMustNotEqualConstraint.java: It is used in the Map Coloring Problem. It is used to get “!=" constraint in the map problem and check consistency. In the context, it means the constraint is that a certain state can not be assigned for a certain color in the file in the problem constraint. VariableXMinusVaribleYNotEqualXMinusYConstraint.java: It is used in the NQueen Problem. It is used to add and check that the diagonal consistency of NQueen. if difference between column numbers is equal to difference between values, it will be in the same diagonal line.
