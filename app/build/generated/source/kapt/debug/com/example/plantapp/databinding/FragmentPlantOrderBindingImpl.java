package com.example.plantapp.databinding;
import com.example.plantapp.R;
import com.example.plantapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlantOrderBindingImpl extends FragmentPlantOrderBinding implements com.example.plantapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.plant_options, 19);
        sViewsWithIds.put(R.id.imageView, 20);
        sViewsWithIds.put(R.id.imageView2, 21);
        sViewsWithIds.put(R.id.imageView3, 22);
        sViewsWithIds.put(R.id.imageView4, 23);
        sViewsWithIds.put(R.id.imageView5, 24);
        sViewsWithIds.put(R.id.imageView6, 25);
        sViewsWithIds.put(R.id.imageView7, 26);
        sViewsWithIds.put(R.id.imageView8, 27);
        sViewsWithIds.put(R.id.divider, 28);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlantOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private FragmentPlantOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[28]
            , (android.widget.RadioButton) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.Button) bindings[18]
            , (android.widget.RadioGroup) bindings[19]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[17]
            );
        this.amazonsword.setTag(null);
        this.amazonswordPrice.setTag(null);
        this.anubiusnana.setTag(null);
        this.anubiusnanaPrice.setTag(null);
        this.dwarfgrass.setTag(null);
        this.dwarfgrassPrice.setTag(null);
        this.frogbit.setTag(null);
        this.frogbitPrice.setTag(null);
        this.javafern.setTag(null);
        this.javafernPrice.setTag(null);
        this.luckybamboo.setTag(null);
        this.luckybambooPrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mossball.setTag(null);
        this.mossballPrice.setTag(null);
        this.nextButton.setTag(null);
        this.salviniaminima.setTag(null);
        this.salviniaminimaPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.example.plantapp.generated.callback.OnClickListener(this, 9);
        mCallback11 = new com.example.plantapp.generated.callback.OnClickListener(this, 5);
        mCallback12 = new com.example.plantapp.generated.callback.OnClickListener(this, 6);
        mCallback9 = new com.example.plantapp.generated.callback.OnClickListener(this, 3);
        mCallback13 = new com.example.plantapp.generated.callback.OnClickListener(this, 7);
        mCallback8 = new com.example.plantapp.generated.callback.OnClickListener(this, 2);
        mCallback14 = new com.example.plantapp.generated.callback.OnClickListener(this, 8);
        mCallback10 = new com.example.plantapp.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.example.plantapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.plantapp.model.OrderViewModel) variable);
        }
        else if (BR.plantOrderFragment == variableId) {
            setPlantOrderFragment((com.example.plantapp.ui.order.PlantOrderFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.plantapp.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setPlantOrderFragment(@Nullable com.example.plantapp.ui.order.PlantOrderFragment PlantOrderFragment) {
        this.mPlantOrderFragment = PlantOrderFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.plantOrderFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelPlantItemsAmazonswordGetFormattedPrice = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelPlantItemsDwarfgrassGetFormattedPrice = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsJavafern = null;
        java.lang.String viewModelPlantItemsSalviniaminimaGetFormattedPrice = null;
        java.lang.String viewModelPlantItemsFrogbitGetFormattedPrice = null;
        java.lang.String viewModelPlantItemsAmazonswordName = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsSalviniaminima = null;
        java.lang.String viewModelPlantItemsAnubiusnanaName = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsAnubiusnana = null;
        java.lang.String viewModelPlantItemsFrogbitName = null;
        java.lang.String viewModelPlantItemsLuckybambooGetFormattedPrice = null;
        java.lang.String viewModelPlantItemsJavafernName = null;
        java.lang.String viewModelPlantItemsMossballGetFormattedPrice = null;
        java.lang.String viewModelPlantItemsMossballName = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsMossball = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsAmazonsword = null;
        java.lang.String viewModelPlantItemsSalviniaminimaName = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsLuckybamboo = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsFrogbit = null;
        java.util.Map<java.lang.String,com.example.plantapp.model.PlantItem> viewModelPlantItems = null;
        java.lang.String viewModelPlantItemsDwarfgrassName = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.lang.String viewModelPlantItemsLuckybambooName = null;
        com.example.plantapp.model.PlantItem ViewModelPlantItemsAnubiusnana1 = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsDwarfgrass = null;
        java.lang.String viewModelSubtotalGetValue = null;
        java.lang.String viewModelPlantItemsAnubiusnanaGetFormattedPrice = null;
        java.lang.String viewModelPlantItemsJavafernGetFormattedPrice = null;
        com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
        com.example.plantapp.ui.order.PlantOrderFragment plantOrderFragment = mPlantOrderFragment;
        java.util.Map<java.lang.String,com.example.plantapp.model.PlantItem> ViewModelPlantItems1 = null;

        if ((dirtyFlags & 0xbL) != 0) {



                if (viewModel != null) {
                    // read viewModel.subtotal
                    viewModelSubtotal = viewModel.getSubtotal();
                }
                updateLiveDataRegistration(0, viewModelSubtotal);


                if (viewModelSubtotal != null) {
                    // read viewModel.subtotal.getValue()
                    viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                }


                // read @android:string/subtotal
                subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            if ((dirtyFlags & 0xaL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.plantItems
                        viewModelPlantItems = viewModel.getPlantItems();
                        // read viewModel.PlantItems
                        ViewModelPlantItems1 = viewModel.getPlantItems();
                    }


                    if (viewModelPlantItems != null) {
                        // read viewModel.plantItems["javafern"]
                        viewModelPlantItemsJavafern = viewModelPlantItems.get("javafern");
                        // read viewModel.plantItems["salviniaminima"]
                        viewModelPlantItemsSalviniaminima = viewModelPlantItems.get("salviniaminima");
                        // read viewModel.plantItems["anubiusnana"]
                        viewModelPlantItemsAnubiusnana = viewModelPlantItems.get("anubiusnana");
                        // read viewModel.plantItems["mossball"]
                        viewModelPlantItemsMossball = viewModelPlantItems.get("mossball");
                        // read viewModel.plantItems["luckybamboo"]
                        viewModelPlantItemsLuckybamboo = viewModelPlantItems.get("luckybamboo");
                        // read viewModel.plantItems["frogbit"]
                        viewModelPlantItemsFrogbit = viewModelPlantItems.get("frogbit");
                        // read viewModel.plantItems["dwarfgrass"]
                        viewModelPlantItemsDwarfgrass = viewModelPlantItems.get("dwarfgrass");
                    }
                    if (ViewModelPlantItems1 != null) {
                        // read viewModel.PlantItems["amazonsword"]
                        viewModelPlantItemsAmazonsword = ViewModelPlantItems1.get("amazonsword");
                        // read viewModel.PlantItems["anubiusnana"]
                        ViewModelPlantItemsAnubiusnana1 = ViewModelPlantItems1.get("anubiusnana");
                    }


                    if (viewModelPlantItemsJavafern != null) {
                        // read viewModel.plantItems["javafern"].name
                        viewModelPlantItemsJavafernName = viewModelPlantItemsJavafern.getName();
                        // read viewModel.plantItems["javafern"].getFormattedPrice()
                        viewModelPlantItemsJavafernGetFormattedPrice = viewModelPlantItemsJavafern.getFormattedPrice();
                    }
                    if (viewModelPlantItemsSalviniaminima != null) {
                        // read viewModel.plantItems["salviniaminima"].getFormattedPrice()
                        viewModelPlantItemsSalviniaminimaGetFormattedPrice = viewModelPlantItemsSalviniaminima.getFormattedPrice();
                        // read viewModel.plantItems["salviniaminima"].name
                        viewModelPlantItemsSalviniaminimaName = viewModelPlantItemsSalviniaminima.getName();
                    }
                    if (viewModelPlantItemsAnubiusnana != null) {
                        // read viewModel.plantItems["anubiusnana"].getFormattedPrice()
                        viewModelPlantItemsAnubiusnanaGetFormattedPrice = viewModelPlantItemsAnubiusnana.getFormattedPrice();
                    }
                    if (viewModelPlantItemsMossball != null) {
                        // read viewModel.plantItems["mossball"].getFormattedPrice()
                        viewModelPlantItemsMossballGetFormattedPrice = viewModelPlantItemsMossball.getFormattedPrice();
                        // read viewModel.plantItems["mossball"].name
                        viewModelPlantItemsMossballName = viewModelPlantItemsMossball.getName();
                    }
                    if (viewModelPlantItemsLuckybamboo != null) {
                        // read viewModel.plantItems["luckybamboo"].getFormattedPrice()
                        viewModelPlantItemsLuckybambooGetFormattedPrice = viewModelPlantItemsLuckybamboo.getFormattedPrice();
                        // read viewModel.plantItems["luckybamboo"].name
                        viewModelPlantItemsLuckybambooName = viewModelPlantItemsLuckybamboo.getName();
                    }
                    if (viewModelPlantItemsFrogbit != null) {
                        // read viewModel.plantItems["frogbit"].getFormattedPrice()
                        viewModelPlantItemsFrogbitGetFormattedPrice = viewModelPlantItemsFrogbit.getFormattedPrice();
                        // read viewModel.plantItems["frogbit"].name
                        viewModelPlantItemsFrogbitName = viewModelPlantItemsFrogbit.getName();
                    }
                    if (viewModelPlantItemsDwarfgrass != null) {
                        // read viewModel.plantItems["dwarfgrass"].getFormattedPrice()
                        viewModelPlantItemsDwarfgrassGetFormattedPrice = viewModelPlantItemsDwarfgrass.getFormattedPrice();
                        // read viewModel.plantItems["dwarfgrass"].name
                        viewModelPlantItemsDwarfgrassName = viewModelPlantItemsDwarfgrass.getName();
                    }
                    if (viewModelPlantItemsAmazonsword != null) {
                        // read viewModel.PlantItems["amazonsword"].getFormattedPrice()
                        viewModelPlantItemsAmazonswordGetFormattedPrice = viewModelPlantItemsAmazonsword.getFormattedPrice();
                        // read viewModel.PlantItems["amazonsword"].name
                        viewModelPlantItemsAmazonswordName = viewModelPlantItemsAmazonsword.getName();
                    }
                    if (ViewModelPlantItemsAnubiusnana1 != null) {
                        // read viewModel.PlantItems["anubiusnana"].name
                        viewModelPlantItemsAnubiusnanaName = ViewModelPlantItemsAnubiusnana1.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.amazonsword, viewModelPlantItemsAmazonswordName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.amazonswordPrice, viewModelPlantItemsAmazonswordGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.anubiusnana, viewModelPlantItemsAnubiusnanaName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.anubiusnanaPrice, viewModelPlantItemsAnubiusnanaGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dwarfgrass, viewModelPlantItemsDwarfgrassName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dwarfgrassPrice, viewModelPlantItemsDwarfgrassGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.frogbit, viewModelPlantItemsFrogbitName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.frogbitPrice, viewModelPlantItemsFrogbitGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.javafern, viewModelPlantItemsJavafernName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.javafernPrice, viewModelPlantItemsJavafernGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.luckybamboo, viewModelPlantItemsLuckybambooName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.luckybambooPrice, viewModelPlantItemsLuckybambooGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mossball, viewModelPlantItemsMossballName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mossballPrice, viewModelPlantItemsMossballGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.salviniaminima, viewModelPlantItemsSalviniaminimaName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.salviniaminimaPrice, viewModelPlantItemsSalviniaminimaGetFormattedPrice);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.amazonsword.setOnClickListener(mCallback9);
            this.anubiusnana.setOnClickListener(mCallback10);
            this.dwarfgrass.setOnClickListener(mCallback14);
            this.frogbit.setOnClickListener(mCallback13);
            this.javafern.setOnClickListener(mCallback7);
            this.luckybamboo.setOnClickListener(mCallback8);
            this.mossball.setOnClickListener(mCallback12);
            this.nextButton.setOnClickListener(mCallback15);
            this.salviniaminima.setOnClickListener(mCallback11);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 9: {
                // localize variables for thread safety
                // plantOrderFragment
                com.example.plantapp.ui.order.PlantOrderFragment plantOrderFragment = mPlantOrderFragment;
                // plantOrderFragment != null
                boolean plantOrderFragmentJavaLangObjectNull = false;



                plantOrderFragmentJavaLangObjectNull = (plantOrderFragment) != (null);
                if (plantOrderFragmentJavaLangObjectNull) {


                    plantOrderFragment.goToNextScreen();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setPlant("salviniaminima");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setPlant("mossball");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setPlant("amazonsword");
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setPlant("frogbit");
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setPlant("luckybamboo");
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setPlant("dwarfgrass");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setPlant("anubiusnana");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setPlant("javafern");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): plantOrderFragment
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}