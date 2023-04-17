package respositorio;

import java.io.IOException;
import java.util.List;

public interface ILectorJson<T>  {
    List<T> getTList();
}