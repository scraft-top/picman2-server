package top.scraft.picmanserver.rest.result.api.piclib;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.scraft.picmanserver.rest.result.api.PiclibResult;

@EqualsAndHashCode(callSuper = true)
@Data
public class PiclibResultWrapper<T> extends PiclibResult {

    private T data;

}