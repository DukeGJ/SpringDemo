package domain;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollections {
    private List addressList;
    private Set addressSet;
    private Map addressMap;

    public List getAddressList() {
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    @Override
    public String toString() {
        return "JavaCollections{" +
                "addressList=" + addressList +
                ", addressSet=" + addressSet +
                ", addressMap=" + addressMap +
                '}';
    }
}
