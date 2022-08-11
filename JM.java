package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JM {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String key = reader.readLine();
            System.out.println(calc(key));
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static String calc(String value){
            if(value.contains("-")) {
                int con1 = 0;
                int con2 = 0;
                int con;
                int count = 0;
                String resCon;

                char[] check = value.toCharArray();
                for (int i = 0; i < check.length; i++) {
                     if(check[i] == '-'){
                        count++;
                        try {
                            if(count >= 2){
                                throw new Exception();
                            }
                        } catch (Exception e){
                            return String.valueOf(e);
                        }
                    }
                }

                String minusT = value.replaceAll("[\\s|\\u00A0]+", "");
                String[] minus = minusT.split("-");
//                try {
//                    if (Integer.parseInt(minus[0]) < 0 || Integer.parseInt(minus[0]) > 10 || Integer.parseInt(minus[1]) < 0 || Integer.parseInt(minus[1]) > 10){
//                        throw new Exception();
//                    }
//                } catch (Exception e){
//                    return String.valueOf(e);
//                }

//                try {
//                    if((minus[0].equals("I") || minus[0].equals("II")||minus[0].equals("III")||minus[0].equals("IV")||minus[0].equals("V")||minus[0].equals("VI")||minus[0].equals("VII")||minus[0].equals("VIII")||minus[0].equals("IX")||minus[0].equals("X") && minus[1].equals("1")||minus[1].equals("2")||minus[1].equals("3")||minus[1].equals("4")||minus[1].equals("5")||minus[1].equals("6")||minus[1].equals("7")||minus[1].equals("8")||minus[1].equals("9")||minus[1].equals("10")
//                    ) && (minus[1].equals("I")||minus[1].equals("II")||minus[1].equals("III")||minus[1].equals("IV")||minus[1].equals("V")||minus[1].equals("VI")||minus[1].equals("VII")||minus[1].equals("VIII")||minus[1].equals("IX")||minus[1].equals("X") && minus[0].equals("1") || minus[0].equals("2")||minus[0].equals("3")||minus[0].equals("4")||minus[0].equals("5")||minus[0].equals("6")||minus[0].equals("7")||minus[0].equals("8")||minus[0].equals("9")||minus[0].equals("10"))){
//                        throw new Exception();
//                    }
//                } catch(Exception e){
//                    return String.valueOf(e);
//                }

                    if(minus[0].equals("I") || minus[0].equals("II")||minus[0].equals("III")||minus[0].equals("IV")||minus[0].equals("V")||minus[0].equals("VI")||minus[0].equals("VII")||minus[0].equals("VIII")||minus[0].equals("IX")||minus[0].equals("X") && minus[1].equals("I")||minus[1].equals("II")||minus[1].equals("III")||minus[1].equals("IV")||minus[1].equals("V")||minus[1].equals("VI")||minus[1].equals("VII")||minus[1].equals("VIII")||minus[1].equals("IX")||minus[1].equals("X")) {
                        con1 = convert(minus[0]);
                        con2 = convert(minus[1]);
                        con = con1 - con2;
                        try{
                            if(con < 0){
                                throw new Exception();
                            }
                        } catch (Exception e) {
                            return String.valueOf(e);
                        }
                        resCon = convert2(con);
                        return resCon;
                    }
                    int minusRes = Integer.parseInt(minus[0]) - Integer.parseInt(minus[1]);
                    return String.valueOf(minusRes);
            }



            else if(value.contains("+")){
                int con1 = 0;
                int con2 = 0;
                int con;
                int count = 0;
                String resCon;

                char[] check = value.toCharArray();
                for (int i = 0; i < check.length; i++) {
                    if(check[i] == '+'){
                        count++;
                        try {
                            if(count >= 2){
                                throw new Exception();
                            }
                        } catch (Exception e){
                            return String.valueOf(e);
                        }
                    }
                }

                String plusT = value.replaceAll("[\\s|\\u00A0]+", "");
                String[] plus = plusT.split("\\+");
//                try {
//                    if (Integer.parseInt(plus[0]) < 0 || Integer.parseInt(plus[0]) > 10 || Integer.parseInt(plus[1]) < 0 || Integer.parseInt(plus[1]) > 10){
//                        throw new Exception();
//                    }
//                } catch (Exception e){
//                    return String.valueOf(e);
//                }
//
//                try {
//                    if((plus[0].equals("I") || plus[0].equals("II")||plus[0].equals("III")||plus[0].equals("IV")||plus[0].equals("V")||plus[0].equals("VI")||plus[0].equals("VII")||plus[0].equals("VIII")||plus[0].equals("IX")||plus[0].equals("X") && plus[1].equals("1")||plus[1].equals("2")||plus[1].equals("3")||plus[1].equals("4")||plus[1].equals("5")||plus[1].equals("6")||plus[1].equals("7")||plus[1].equals("8")||plus[1].equals("9")||plus[1].equals("10")
//                    ) && (plus[1].equals("I")||plus[1].equals("II")||plus[1].equals("III")||plus[1].equals("IV")||plus[1].equals("V")||plus[1].equals("VI")||plus[1].equals("VII")||plus[1].equals("VIII")||plus[1].equals("IX")||plus[1].equals("X") && plus[0].equals("1") || plus[0].equals("2")||plus[0].equals("3")||plus[0].equals("4")||plus[0].equals("5")||plus[0].equals("6")||plus[0].equals("7")||plus[0].equals("8")||plus[0].equals("9")||plus[0].equals("10"))){
//                        throw new Exception();
//                    }
//                } catch(Exception e){
//                    return String.valueOf(e);
//                }

                if(plus[0].equals("I") || plus[0].equals("II")||plus[0].equals("III")||plus[0].equals("IV")||plus[0].equals("V")||plus[0].equals("VI")||plus[0].equals("VII")||plus[0].equals("VIII")||plus[0].equals("IX")||plus[0].equals("X") && plus[1].equals("I")||plus[1].equals("II")||plus[1].equals("III")||plus[1].equals("IV")||plus[1].equals("V")||plus[1].equals("VI")||plus[1].equals("VII")||plus[1].equals("VIII")||plus[1].equals("IX")||plus[1].equals("X")) {
                    con1 = convert(plus[0]);
                    con2 = convert(plus[1]);
                    con = con1+con2;
                    resCon = convert2(con);
                    return resCon;
                }

                int plusRes = Integer.parseInt(plus[0]) + Integer.parseInt(plus[1]);
                return String.valueOf(plusRes);
            }



            else if(value.contains("/")){
                int con1 = 0;
                int con2 = 0;
                int con;
                int count = 0;
                String resCon;

                char[] check = value.toCharArray();
                for (int i = 0; i < check.length; i++) {
                    if(check[i] == '/'){
                        count++;
                        try {
                            if(count >= 2){
                                throw new Exception();
                            }
                        } catch (Exception e){
                            return String.valueOf(e);
                        }
                    }
                }

                String divT = value.replaceAll("[\\s|\\u00A0]+", "");
                String[] plus = divT.split("/");
//                try {
//                    if (Integer.parseInt(plus[0]) < 0 || Integer.parseInt(plus[0]) > 10 || Integer.parseInt(plus[1]) < 0 || Integer.parseInt(plus[1]) > 10){
//                        throw new Exception();
//                    }
//                } catch (Exception e){
//                    return String.valueOf(e);
//                }
//
//                try {
//                    if((plus[0].equals("I") || plus[0].equals("II")||plus[0].equals("III")||plus[0].equals("IV")||plus[0].equals("V")||plus[0].equals("VI")||plus[0].equals("VII")||plus[0].equals("VIII")||plus[0].equals("IX")||plus[0].equals("X") && plus[1].equals("1")||plus[1].equals("2")||plus[1].equals("3")||plus[1].equals("4")||plus[1].equals("5")||plus[1].equals("6")||plus[1].equals("7")||plus[1].equals("8")||plus[1].equals("9")||plus[1].equals("10")
//                    ) && (plus[1].equals("I")||plus[1].equals("II")||plus[1].equals("III")||plus[1].equals("IV")||plus[1].equals("V")||plus[1].equals("VI")||plus[1].equals("VII")||plus[1].equals("VIII")||plus[1].equals("IX")||plus[1].equals("X") && plus[0].equals("1") || plus[0].equals("2")||plus[0].equals("3")||plus[0].equals("4")||plus[0].equals("5")||plus[0].equals("6")||plus[0].equals("7")||plus[0].equals("8")||plus[0].equals("9")||plus[0].equals("10"))){
//                        throw new Exception();
//                    }
//                } catch(Exception e){
//                    return String.valueOf(e);
//                }

                if(plus[0].equals("I") || plus[0].equals("II")||plus[0].equals("III")||plus[0].equals("IV")||plus[0].equals("V")||plus[0].equals("VI")||plus[0].equals("VII")||plus[0].equals("VIII")||plus[0].equals("IX")||plus[0].equals("X") && plus[1].equals("I")||plus[1].equals("II")||plus[1].equals("III")||plus[1].equals("IV")||plus[1].equals("V")||plus[1].equals("VI")||plus[1].equals("VII")||plus[1].equals("VIII")||plus[1].equals("IX")||plus[1].equals("X")) {
                    con1 = convert(plus[0]);
                    con2 = convert(plus[1]);
                    con = con1/con2;
                    resCon = convert2(con);
                    return resCon;
                }

                int plusRes = Integer.parseInt(plus[0]) / Integer.parseInt(plus[1]);
                return String.valueOf(plusRes);
            }



            else if(value.contains("*")){
                int con1 = 0;
                int con2 = 0;
                int con;
                int count = 0;
                String resCon;

                char[] check = value.toCharArray();
                for (int i = 0; i < check.length; i++) {
                    if(check[i] == '*'){
                        count++;
                        try {
                            if(count >= 2){
                                throw new Exception();
                            }
                        } catch (Exception e){
                            return String.valueOf(e);
                        }
                    }
                }
                
                String multT = value.replaceAll("[\\s|\\u00A0]+", "");
                String[] mult = multT.split("\\*");
//                try {
//                    if (Integer.parseInt(mult[0]) < 0 || Integer.parseInt(mult[0]) > 10 || Integer.parseInt(mult[1]) < 0 || Integer.parseInt(mult[1]) > 10){
//                        throw new Exception();
//                    }
//                } catch (Exception e){
//                    return String.valueOf(e);
//                }
//
//                try {
//                    if((mult[0].equals("I") || mult[0].equals("II")||mult[0].equals("III")||mult[0].equals("IV")||mult[0].equals("V")||mult[0].equals("VI")||mult[0].equals("VII")||mult[0].equals("VIII")||mult[0].equals("IX")||mult[0].equals("X") && mult[1].equals("1")||mult[1].equals("2")||mult[1].equals("3")||mult[1].equals("4")||mult[1].equals("5")||mult[1].equals("6")||mult[1].equals("7")||mult[1].equals("8")||mult[1].equals("9")||mult[1].equals("10")
//                    ) && (mult[1].equals("I")||mult[1].equals("II")||mult[1].equals("III")||mult[1].equals("IV")||mult[1].equals("V")||mult[1].equals("VI")||mult[1].equals("VII")||mult[1].equals("VIII")||mult[1].equals("IX")||mult[1].equals("X") && mult[0].equals("1") || mult[0].equals("2")||mult[0].equals("3")||mult[0].equals("4")||mult[0].equals("5")||mult[0].equals("6")||mult[0].equals("7")||mult[0].equals("8")||mult[0].equals("9")||mult[0].equals("10"))){
//                        throw new Exception();
//                    }
//                } catch(Exception e){
//                    return String.valueOf(e);
//                }

                if(mult[0].equals("I") || mult[0].equals("II")||mult[0].equals("III")||mult[0].equals("IV")||mult[0].equals("V")||mult[0].equals("VI")||mult[0].equals("VII")||mult[0].equals("VIII")||mult[0].equals("IX")||mult[0].equals("X") && mult[1].equals("I")||mult[1].equals("II")||mult[1].equals("III")||mult[1].equals("IV")||mult[1].equals("V")||mult[1].equals("VI")||mult[1].equals("VII")||mult[1].equals("VIII")||mult[1].equals("IX")||mult[1].equals("X")) {
                    con1 = convert(mult[0]);
                    con2 = convert(mult[1]);
                    con = con1*con2;
                    resCon = convert2(con);
                    return resCon;
                }

                int multRes = Integer.parseInt(mult[0]) * Integer.parseInt(mult[1]);
                return String.valueOf(multRes);
            }

        return "java.lang.Exception";
    }

    public static int convert(String roman){
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
            else if (roman.equals("XI")) {
                return 11;
            } else if (roman.equals("XII")) {
                return 12;
            } else if (roman.equals("XIII")) {
                return 13;
            } else if (roman.equals("XIV")) {
                return 14;
            } else if (roman.equals("XV")) {
                return 15;
            } else if (roman.equals("XVI")) {
                return 16;
            } else if (roman.equals("XVII")) {
                return 17;
            } else if (roman.equals("XVIII")) {
                return 28;
            } else if (roman.equals("XIX")) {
                return 19;
            } else if (roman.equals("XX")) {
                return 20;
            }
        return -1;
    }

    public static String convert2(int num){
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String s = roman[num];
        return s;
    }

}
