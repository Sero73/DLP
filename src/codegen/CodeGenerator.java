package codegen;

import ast.Type;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {
    private PrintWriter out;

    public CodeGenerator(String outputFilename, String sourceFilename) {
        try{
            this.out = new PrintWriter(outputFilename);
        }catch (IOException e){
            System.out.println("Error oppening the file " +  outputFilename + ".");
            System.exit(-1);
        }
        this.commentSource(sourceFilename); //#source input.txt
    }

    public void convertTo(Type from, Type to) {
        if(from.suffix().equals(to.suffix())){
            return;
        }

        if(from.suffix().equals("i")) {
            if (to.suffix().equals("f")) {
                this.out.println("\ti2f");
            } else if (to.suffix().equals("b")) {
                this.out.println("\ti2b");
            }
        }else if(from.suffix().equals("f")) {
            if (to.suffix().equals("i")) {
                this.out.println("\tf2i");
            }else if(to.suffix().equals("b")) {
                this.out.println("\tf2i");
                this.out.println("\ti2b");
            }
        }else if(from.suffix().equals("b")){
                if(to.suffix().equals("i")) {
                    this.out.println("\tb2i");
                }else if(to.suffix().equals("f")) {
                    this.out.println("\tb2i");
                    this.out.println("\ti2f");
                }
            }
        this.out.flush();
    }

    public void call(String name){
        out.println("\tcall\t" + name);
        this.out.flush();
    }

    public void callMain(){
        out.println("\n' Invocation to the main function'");
        out.println("call main");
        this.out.flush();
    }

    public void halt(){
        out.println("halt\n");
        this.out.flush();
    }

    public void store(Type type) {
        out.println("\tstore" + type.suffix());
        this.out.flush();
    }

    public void load(Type type) {
        out.println("\tload" + type.suffix());
        this.out.flush();
    }

    public void in(Type type) {
        out.println("\tin" + type.suffix());
        this.out.flush();
    }

    public void out(Type type) {
        out.println("\tout" + type.suffix());
        this.out.flush();
    }

    public void pusha(int offset){
        out.println("\tpusha\t" + offset);
        this.out.flush();
    }

    public void pushBP(){
        out.println("\tpush\tbp");
        this.out.flush();
    }

    public void push(int intValue){
        out.println("\tpushi\t" + intValue);
        this.out.flush();
    }

    public void push(double doubleValue){
        out.println("\tpushf\t" + doubleValue);
        this.out.flush();
    }

    public void push(char charValue){
        out.println("\tpushb\t" + (int)charValue);
        this.out.flush();
    }

    public void pop(Type type) {
        out.println("\tpop" + type.suffix());
        this.out.flush();
    }

    //Unary Minus
    public void neg(){
        out.println("\tneg");
        this.out.flush();
    }

    public void negf(){
        out.println("\tnegf");
        this.out.flush();
    }

    //Arithmetic
    public void arithmetic(String operator, Type type){
        switch (operator){
            case "+" -> add(type);
            case"-" -> sub(type);
            case "*" -> mul(type);
            case "/" -> div(type);
            case "%" -> mod(type);
        }
    }

    public void add(Type type){
        out.println("\tadd" + type.suffix());
        this.out.flush();
    }

    public void sub(Type type){
        out.println("\tsub" + type.suffix());
        this.out.flush();
    }

    public void mul(Type type){
        out.println("\tmul" + type.suffix());
        this.out.flush();
    }

    public void div(Type type){
        out.println("\tdiv" + type.suffix());
        this.out.flush();
    }

    public void mod(Type type){
        out.println("\tmod" + type.suffix());
        this.out.flush();
    }

    //Logical
    public void logical(String operator){
        switch (operator){
            case "&&" -> and();
            case "||" -> or();
            case "!" -> not();
        }
    }

    public void and(){
        out.println("\tand");
        this.out.flush();
    }

    public void or(){
        out.println("\tor");
        this.out.flush();
    }

    public void not(){
        out.println("\tnot");
        this.out.flush();
    }

    //Comparison
    public void comparison(String operator,Type type){
        switch (operator){
            case(">=") -> ge(type);
            case(">") -> gt(type);
            case ("<=") -> le(type);
            case("<") -> lt(type);
            case "==" -> eq(type);
            case "!=" -> neq(type);

        }
    }

    public void gt(Type type){
        out.println("\tgt" + type.suffix());
        this.out.flush();
    }

    public void ge(Type type){
        out.println("\tge" + type.suffix());
        this.out.flush();
    }

    public void lt(Type type){
        out.println("\tlt" + type.suffix());
        this.out.flush();
    }

    public void le(Type type){
        out.println("\tle" + type.suffix());
        this.out.flush();
    }

    public void eq(Type type){
        out.println("\teq" + type.suffix());
        this.out.flush();
    }

    public void neq(Type type){
        out.println("\tneq" + type.suffix());
        this.out.flush();
    }

    //Functions
    public void ret(int returnSize, int localSize, int paramSize){
        out.println("\tret\t" + returnSize + "," + localSize + "," + paramSize);
        this.out.flush();
    }

    public void printFunctionName(String functionName){
        out.println("\n " + functionName + ":");
        this.out.flush();
    }

    public void enter(int size){
        out.println("\tenter\t" + size);
        this.out.flush();
    }

    //Comentarios Mapple

    public void commentSource(String source){
        out.println("\n#source \"" + source + "\"\n");
        this.out.flush();
    }
    public void commentLine(int line){
        out.println("\n#line\t" + line);
        this.out.flush();
    }

    public void comment(String text){
        out.println("\t' * " + text);
        this.out.flush();
    }

}
