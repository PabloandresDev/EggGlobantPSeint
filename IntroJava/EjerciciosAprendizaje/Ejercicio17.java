����   = ]
      java/lang/Object <init> ()V
  	 
   !EjerciciosAprendizaje/Ejercicio17 contabilizarDigitos  java/util/Random
   ��
     nextInt (II)I	      java/lang/System out Ljava/io/PrintStream;      makeConcatWithConstants (II)Ljava/lang/String;
    ! " # java/io/PrintStream println (Ljava/lang/String;)V ��  &  ' (I)Ljava/lang/String;  &  &  &  & Code LineNumberTable LocalVariableTable this #LEjerciciosAprendizaje/Ejercicio17; main ([Ljava/lang/String;)V args [Ljava/lang/String; i I numeros [I cont1 cont2 cont3 cont4 cont5 random Ljava/util/Random; StackMapTable 8 
SourceFile Ejercicio17.java BootstrapMethods F
 G H I  J $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; L numeros [] =  N %Cantidad de numeros con 1 digitos =  P %Cantidad de numeros con 2 digitos =  R %Cantidad de numeros con 3 digitos =  T %Cantidad de numeros con 4 digitos =  V %Cantidad de numeros con 5 digitos =  InnerClasses Y %java/lang/invoke/MethodHandles$Lookup [ java/lang/invoke/MethodHandles Lookup !            ,   /     *� �    -        .        / 0   	 1 2  ,   2      � �    -   
       .        3 4   	    ,  �     �d�
K<=>66� Y� :6*�� z*� O� *.�   � *.
l� 	�� F*.dl� 	�� 5*.�l� 	�� #*.'l� 	�� *.$l� ������ � %  � � � (  � � � )  � � � *  � � � +  � �    -   n    	     	          $  0  A  L  R  ]  c  o  u  �  �  �  �  �   � ! � " � # � $ � % .   R   ~ 5 6   � 7 8    � 9 6  	 � : 6   � ; 6   � < 6   � = 6   � > ?  @    �   A   4�   B    C D   &  E  K E  M E  O E  Q E  S E  U W   
  X Z \ 