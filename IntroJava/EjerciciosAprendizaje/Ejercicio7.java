����   = @
      java/lang/Object <init> ()V  eureka 
 java/util/Scanner	      java/lang/System in Ljava/io/InputStream;
 	    (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;  Digite una frase
      java/io/PrintStream println (Ljava/lang/String;)V
 	 ! " # nextLine ()Ljava/lang/String;
 % & ' ( ) java/lang/String equals (Ljava/lang/Object;)Z + Mensaje correcto - Mensaje incorrecto /  EjerciciosAprendizaje/Ejercicio7 Code LineNumberTable LocalVariableTable this "LEjerciciosAprendizaje/Ejercicio7; main ([Ljava/lang/String;)V args [Ljava/lang/String; Ljava/lang/String; scanner Ljava/util/Scanner; frase StackMapTable 
SourceFile Ejercicio7.java ! .           0   /     *� �    1        2        3 4   	 5 6  0   �     7L� 	Y� � M� � ,�  N-+� $� � *� � � ,� �    1   "    
         #  .  6  2   *    7 7 8    4  9   ) : ;    < 9  =    � . % 	 %  >    ?