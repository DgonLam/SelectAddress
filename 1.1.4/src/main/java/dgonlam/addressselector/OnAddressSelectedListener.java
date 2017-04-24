package dgonlam.addressselector;

import dgonlam.addressselector.model.City;
import dgonlam.addressselector.model.County;
import dgonlam.addressselector.model.Province;
import dgonlam.addressselector.model.Street;

public interface OnAddressSelectedListener {
    void onAddressSelected(Province province, City city, County county, Street street);
}
