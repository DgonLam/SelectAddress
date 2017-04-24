package dgonlam.addressselector;

import java.util.List;

import dgonlam.addressselector.model.City;
import dgonlam.addressselector.model.County;
import dgonlam.addressselector.model.Province;
import dgonlam.addressselector.model.Street;

public interface AddressProvider {
    void provideProvinces(AddressReceiver<Province> addressReceiver);
    void provideCitiesWith(int provinceId, AddressReceiver<City> addressReceiver);
    void provideCountiesWith(int cityId, AddressReceiver<County> addressReceiver);
    void provideStreetsWith(int countyId, AddressReceiver<Street> addressReceiver);

    interface AddressReceiver<T> {
        void send(List<T> data);
    }
}