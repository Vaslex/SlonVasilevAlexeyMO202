package com.oop.slon;
public class Slon {
 static final String cmd_help = "\\help";
 static final String cmd_exit = "\\exit";
 static final String suggest = "Купи слона";
 static final String suggest2 = "а ты купи слона";
 public String greetings() {
  return String.format("Здарова,я продаю слона. Для справки используй %s\n%s",cmd_help,suggest);
 }
 public String respond(String line) {
  if(line.equals(cmd_help)) {
   return String.format("Я предлагаю купить слона,ты отвечаешь,а после отвечаю я. Для выхода напиши %s\n%s",cmd_exit,suggest);
  }
  return String.format("Все говорят %s, %s",line,suggest2);
 }
 public boolean isExit(String line) {
  return line.equals(cmd_exit);
 }
}