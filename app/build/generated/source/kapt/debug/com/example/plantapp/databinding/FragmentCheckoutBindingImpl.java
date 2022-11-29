package com.example.plantapp.databinding;
import com.example.plantapp.R;
import com.example.plantapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.plantapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 9);
        sViewsWithIds.put(R.id.divider, 10);
        sViewsWithIds.put(R.id.imageView10, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        this.cancelButton.setTag(null);
        this.deliveryPrice.setTag(null);
        this.deliverySelection.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.plantPrice.setTag(null);
        this.plantSelection.setTag(null);
        this.submitButton.setTag(null);
        this.subtotal.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.example.plantapp.generated.callback.OnClickListener(this, 2);
        mCallback16 = new com.example.plantapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.checkoutFragment == variableId) {
            setCheckoutFragment((com.example.plantapp.ui.order.CheckoutFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.plantapp.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckoutFragment(@Nullable com.example.plantapp.ui.order.CheckoutFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.checkoutFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.plantapp.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelPlant((androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem>) object, fieldId);
            case 2 :
                return onChangeViewModelDelivery((androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem>) object, fieldId);
            case 3 :
                return onChangeViewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewModelPlant(androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem> ViewModelPlant, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDelivery(androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem> ViewModelDelivery, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem> viewModelPlant = null;
        java.lang.String totalAndroidStringTotalViewModelTotal = null;
        com.example.plantapp.model.PlantItem viewModelPlantGetValue = null;
        java.lang.String viewModelDeliveryFormattedPrice = null;
        java.lang.String viewModelPlantFormattedPrice = null;
        androidx.lifecycle.LiveData<com.example.plantapp.model.PlantItem> viewModelDelivery = null;
        java.lang.String viewModelDeliveryName = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        com.example.plantapp.model.PlantItem viewModelDeliveryGetValue = null;
        java.lang.String viewModelSubtotalGetValue = null;
        com.example.plantapp.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        java.lang.String viewModelPlantName = null;
        java.lang.String viewModelTotalGetValue = null;
        com.example.plantapp.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

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
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.plant
                        viewModelPlant = viewModel.getPlant();
                    }
                    updateLiveDataRegistration(1, viewModelPlant);


                    if (viewModelPlant != null) {
                        // read viewModel.plant.getValue()
                        viewModelPlantGetValue = viewModelPlant.getValue();
                    }


                    if (viewModelPlantGetValue != null) {
                        // read viewModel.plant.getValue().formattedPrice
                        viewModelPlantFormattedPrice = viewModelPlantGetValue.getFormattedPrice();
                        // read viewModel.plant.getValue().name
                        viewModelPlantName = viewModelPlantGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.delivery
                        viewModelDelivery = viewModel.getDelivery();
                    }
                    updateLiveDataRegistration(2, viewModelDelivery);


                    if (viewModelDelivery != null) {
                        // read viewModel.delivery.getValue()
                        viewModelDeliveryGetValue = viewModelDelivery.getValue();
                    }


                    if (viewModelDeliveryGetValue != null) {
                        // read viewModel.delivery.getValue().formattedPrice
                        viewModelDeliveryFormattedPrice = viewModelDeliveryGetValue.getFormattedPrice();
                        // read viewModel.delivery.getValue().name
                        viewModelDeliveryName = viewModelDeliveryGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.total
                        viewModelTotal = viewModel.getTotal();
                    }
                    updateLiveDataRegistration(3, viewModelTotal);


                    if (viewModelTotal != null) {
                        // read viewModel.total.getValue()
                        viewModelTotalGetValue = viewModelTotal.getValue();
                    }


                    // read @android:string/total
                    totalAndroidStringTotalViewModelTotal = total.getResources().getString(R.string.total, viewModelTotalGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback17);
            this.submitButton.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deliveryPrice, viewModelDeliveryFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deliverySelection, viewModelDeliveryName);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.plantPrice, viewModelPlantFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.plantSelection, viewModelPlantName);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // checkoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;
                // checkoutFragment
                com.example.plantapp.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.cancelOrder();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // checkoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;
                // checkoutFragment
                com.example.plantapp.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.submitOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): viewModel.plant
        flag 2 (0x3L): viewModel.delivery
        flag 3 (0x4L): viewModel.total
        flag 4 (0x5L): checkoutFragment
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}