package com.javarush.task.task16.task1631;
import com.javarush.task.task16.task1631.common.*;

/* Добавь в класс ImageReaderFactory открытый статический метод getImageReader с параметром ImageTypes.
        6. Метод getImageReader должен создавать и возвращать подходящий Reader.
        7. Метод getImageReader должен кидать исключение IllegalArgumentException, если передан неправильный параметр.
        4. Этот метод должен:
4.1. Для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
4.2. Если передан неправильный параметр, то выбрасывать исключение IllegalArgumentException().!
*/
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) throws IllegalArgumentException{
        if (imageTypes==ImageTypes.JPG){
            return new JpgReader();
        }
        if (imageTypes==ImageTypes.PNG){
            return new PngReader();
        }
        if (imageTypes==ImageTypes.BMP){
           return new BmpReader();
        }
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }

}
