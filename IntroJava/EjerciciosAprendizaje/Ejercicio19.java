����   = W
      java/lang/Object <init> ()V  java/util/Random
    [[I
     nextInt (II)I	      java/lang/System out Ljava/io/PrintStream;      makeConcatWithConstants (I)Ljava/lang/String;
      java/io/PrintStream print (Ljava/lang/String;)V !  
  # $  println &  matrizTraspuesta Antisimetrica= 
 ( ) * + , !EjerciciosAprendizaje/Ejercicio19 antiSimetrica 	([[I[[I)V  .  / (Z)Ljava/lang/String; Code LineNumberTable LocalVariableTable this #LEjerciciosAprendizaje/Ejercicio19; main ([Ljava/lang/String;)V j I i args [Ljava/lang/String; random Ljava/util/Random; matriz matrizTraspuesta StackMapTable ; esSimetrica Z 
SourceFile Ejercicio19.java BootstrapMethods H
 I J K  L $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; N [] P La matriz es simetrica =  InnerClasses S %java/lang/invoke/MethodHandles$Lookup U java/lang/invoke/MethodHandles Lookup ! (           0   /     *� �    1        2        3 4   	 5 6  0  �     �� Y� 	L� 
M� 
N6,�� E6,2�� *,2+�
� O� ,2.�   � ���Ҳ  � "����� %� "6-�� F6-2�� +-2,2.hO� -2.�   � ���Ѳ  � "����,-� '�    1   R        	  
    -  <  N  T  \ 
 b  j  t  �  �  �  �  �  �  �  2   R  # 1 7 8   I 9 8  w 2 7 8  m J 9 8    � : ;    � < =   � >    � ?   @   . �   A  
 
  � 	� 0� � 
� 	� 1�  	 + ,  0   �     B=>+�� .6+2�� *2.+2.h� =������Ҳ � -  � "�    1   & 	      
     ' ! )  /  5 % A & 2   4   " 7 8   1 9 8    B >      B ?    @ B C  @    � � � �   D    E F     G  M G  O Q   
  R T V 