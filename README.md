### Escuela Colombiana de Ingeniería

### Ciclo de Vida de Desarrollo de Software

### Desarrollo Dirigido por Pruebas + DIP + DI

Para este taller se va a trabajar sobre el juego del ahorcado.

El sistema actual de puntuación del juego comienza en 100 puntos y va
descontando 10 puntos cada vez que se propone una letra incorrecta.

Algunos usuarios han propuesto diferentes esquemas para realizar la
puntuación, los cuales se describen a continuación:

* OriginalScore:
    * Es el esquema actual, se inicia con 100 puntos.
    * No se bonifican las letras correctas.
    * Se penaliza con 10 puntos con cada letra incorrecta.
    * El puntaje minimo es 0.

* BonusScore:
    * El juego inicia en 0 puntos.
    * Se bonifica con 10 puntos cada letra correcta.
    * Se penaliza con 5 puntos cada letra incorrecta.
    * El puntaje mínimo es 0

* PowerBonusScore:
    * El juego inicia en 0 puntos.
    * La $i-ésima$ letra correcta se bonifica con $5^i$.
    * Se penaliza con 8 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es
        500.

Lo anterior, se traduce en el siguiente modelo, donde se aplica el
principio de inversión de dependencias:

![imagen](img/model.png)

### Parte I

1. Haga un fork del proyecto (no lo descargue directamente!).

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/96434037-7b80-41f6-a72b-b70f4d7d38c0)


2. A partir del código existente, implemente sólo los cascarones del
   modelo antes indicado.

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/2450ed00-28a5-4b39-baf9-37c9f0e6e0d9)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/78405c98-d148-4de7-b227-b8e1534d0b5e)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/59876c8e-cab2-4fcc-bbb2-cc1c40cf44cd)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/f57280e7-52a1-48c7-9059-ef3160c81667)


3. Haga la especificación de los métodos calculateScore (de las tres
   variantes de GameScore), a partir de las especificaciones
   generales dadas anteriormente. Recuerde tener en cuenta: @pre,
   @pos, @param, @throws.

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/016c1616-0c26-4728-be21-bc12fc11073e)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/b2f5150b-f434-4505-b3cf-aa14515c9523)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/233e01c1-10a9-42f3-9a43-574927002a18)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/56c78b89-a15b-4d93-9890-3d2c73e97f30)


4. Haga commit de lo realizado hasta ahora. Desde la terminal:

    ```sh		
    git add .			
    git commit -m "especificación métodos"
    ```
    
   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/f385794e-97fd-4af7-b06e-8020d4c777ff)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/beed1ab9-06cf-4f89-99c8-97625d477729)


5. Actualice el archivo `pom.xml` e incluya las dependencias para la ultima versión de JUnit.

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/5a3d0e16-785b-4628-96f1-5b086570e4ab)


6. Teniendo en cuenta dichas especificaciones, en la clase donde se
   implementarán las pruebas (GameScoreTest), en los
   comentarios iniciales, especifique las clases de equivalencia para
   las tres variantes de GameScore, e identifique
   condiciones de frontera.

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/348a3c0f-da6b-4633-a729-0be3b2ee7c00)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/10eac5d4-3018-4116-ba7c-c853215e4006)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/104a405f-ed6d-416e-9fe9-489edeb8bac7)


7. Para cada clase de equivalencia y condición de frontera, implemente
   una prueba utilizando JUnit.

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/3ec657f3-7f5d-4925-95b8-9f64d14c0be2)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/bc68e9e6-b8f7-42c1-a3b0-35bddfda2546)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/855f0868-64a2-4d57-aa85-ee7729549e67)


9. Haga commit de lo realizado hasta ahora. Desde la terminal:

    ```sh		
    git add .			
    git commit -m "implementación pruebas"
    ```

    ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/f26f2a0a-0dcc-4129-97e1-399fa7ad0cd4)


10. Realice la implementación de los 'cascarones' realizados anteriormente.
   Asegúrese que todas las pruebas unitarias creadas en los puntos anteriores
   se ejecutan satisfactoriamente.

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/5de8ec2c-7ecf-4f3c-b646-166c255c5ddc)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/1849646c-08f6-4e87-a97f-38ef3637e415)

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/313c57d2-34cf-47f2-8226-3d04bf74a07a)


11. Al finalizar haga un nuevo commit:

    ```sh		
    git add .			
    git commit -m "implementación del modelo"
    ```

   ![image](https://github.com/Nat15005/DependencyInjectionHangman/assets/111907712/0dcdd031-4e25-44dc-8462-4eb122c1e7d9)
   

12. Para sincronizar el avance en el respositorio y NO PERDER el trabajo, use
    el comando de GIT para enviar los cambios:

    ```sh
    git push origin main
    ```

    

### Parte II

Actualmente se utiliza el patrón FactoryMethod
que desacopla la creación de los objetos para diseñar un juego
de ahorcado (revisar setup.factoryMethod, el
constructor de la clase GUI y HangmanFactoryMethod).

1. Utilizando el HangmanFactoryMethod (MétodoFabrica) incluya el
   OriginalScore a la configuración.

* Mediante la configuración de la Inyección de
  Dependencias se pueda cambiar el comportamiento del mismo, por
  ejemplo:
    * Utilizar el esquema OriginalScore.
    * Utilizar el esquema BonusScore.
    * Utilizar el idioma francés.
    * Utilizar el diccionario francés.
    * etc...
