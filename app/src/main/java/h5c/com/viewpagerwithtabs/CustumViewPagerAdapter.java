package h5c.com.viewpagerwithtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author Harsh on 25-04-2017.
 */

public class CustumViewPagerAdapter extends FragmentPagerAdapter {

    /**
     * Supre Constructor
     * @param fm
     */
    public CustumViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    /**
     * call fragment based on select tabs
     * @param position selected rab position
     * @return Fragment
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragment1 fragment1 = new Fragment1();
                return fragment1;
            case 1:
                Fragment2 fragment2 = new Fragment2();
                return fragment2;
            case 2:
                Fragment3 fragment3 = new Fragment3();
                return fragment3;
        }
        return null;
    }


    /**
     * for setting no of tabs
     * @return no of tabs
     */
    @Override
    public int getCount() {
        //3 pages
        return 3;
    }

    /**
     * for setting tab title
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Fragment 1";
            case 1: return "Fragment 2";
            case 2: return "Fragment 3";
        }
        return null;
    }
}
