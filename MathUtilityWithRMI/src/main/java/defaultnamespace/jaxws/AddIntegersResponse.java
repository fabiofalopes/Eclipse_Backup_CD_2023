
package defaultnamespace.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.2
 * Mon Nov 06 19:17:01 WET 2023
 * Generated source version: 3.6.2
 */

@XmlRootElement(name = "addIntegersResponse", namespace = "http://utility.math.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addIntegersResponse", namespace = "http://utility.math.com/")

public class AddIntegersResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

