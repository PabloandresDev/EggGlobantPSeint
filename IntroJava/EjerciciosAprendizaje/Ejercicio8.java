����   = >
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  WDigite una frase o palabra maximo de 8 caracteres (los pescacion cuentas como caracter)
      java/io/PrintStream println (Ljava/lang/String;)V
     ! nextLine ()Ljava/lang/String;
 # $ % & ' java/lang/String length ()I ) 
Imcorrecto + Correcto -  EjerciciosAprendizaje/Ejercicio8 Code LineNumberTable LocalVariableTable this "LEjerciciosAprendizaje/Ejercicio8; main ([Ljava/lang/String;)V args [Ljava/lang/String; scanner Ljava/util/Scanner; frase Ljava/lang/String; StackMapTable 
SourceFile Ejercicio8.java ! ,           .   /     *� �    /        0        1 2   	 3 4  .   �     5� Y� 	� L� � +� M,� "� � (� � � *� �    /           	  
 !  ,  4  0        5 5 6    * 7 8    9 :  ;    � ,  #  <    =