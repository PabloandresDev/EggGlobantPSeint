����   = l
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  [I
      !EjerciciosAprendizaje/Ejercicio20 mostrarMatriz ([[I)V
     matrizMagica	 
     out Ljava/io/PrintStream; " La matriz no es cuadrada
 $ % & ' ( java/io/PrintStream println (Ljava/lang/String;)V   * + , makeConcatWithConstants (I)Ljava/lang/String;  *  *  * 1 La matriz es Magica 3 La matriz no es magica  *
 $ 6 7 ( print 9   Code LineNumberTable LocalVariableTable this #LEjerciciosAprendizaje/Ejercicio20; main ([Ljava/lang/String;)V args [Ljava/lang/String; scanner Ljava/util/Scanner; matriz [[I StackMapTable F j I i valorMagico esMagico Z sumaDiagnal1 sumaDiagonal2 	sumaFilas sumaColumnas 
SourceFile Ejercicio20.java BootstrapMethods W
 X Y Z + [ $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; ] sumaDiagnal1 =  _ sumaDiagonal2 =  a sumaFilas =  c sumaColumnas =  e [] InnerClasses h %java/lang/invoke/MethodHandles$Lookup j java/lang/invoke/MethodHandles Lookup !            :   /     *� �    ;        <        = >   	 ? @  :   �     g� Y� 	� L� Y�
YOYOYOSY�
Y	OYOYOSY�
YOYOYOSM,� ,�,2�� 
,� � � !� #�    ;         	 J  N  W  ^  f  <        g A B    \ C D  J  E F  G    � ^  H 	    :    	   �*2.*2.`*2.`<=>6666*�� r� h666*2�� G*2.`6*2.`6� *2.`>d� *2.`6����� 	� =����� 	� =� A� � )  � #� � -  � #� � .  � #� � /  � #� 0� #� � 2� #�    ;   ~                 )   - ! 0 " 3 # @ % L ' X ) _ * i - r . ~ # � 2 � 3 �  � 7 � 8 � : � ; � < � = � > � ? � A � C <   \ 	 6 N I J  " v K J    � E F    � L J   � M N   � O J   � P J   � Q J   � R J  G   ' � "  H  � 2� � 
� A 	    :   �     7<*�� 1=*2�� � *2.� 4  � 5���� 8� #���ϱ    ;       F  G  H " G ( J 0 F 6 L <      
  I J   4 K J    7 E F   G    � � � �   S    T U      V  \ V  ^ V  ` V  b V  d f   
  g i k 