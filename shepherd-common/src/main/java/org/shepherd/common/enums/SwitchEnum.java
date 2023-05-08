package org.shepherd.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SwitchEnum {

    ENABLED(true),

    DISABLED(false);

    private final boolean isOpen;

}
