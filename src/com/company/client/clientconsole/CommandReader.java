package com.company.client.clientconsole;

import java.util.Scanner;

public class CommandReader {
    Scanner scan;
    public CommandReader(){
        scan = new Scanner(System.in);
    }
    public String getCommand(){
        return scan.nextLine();
    }
}