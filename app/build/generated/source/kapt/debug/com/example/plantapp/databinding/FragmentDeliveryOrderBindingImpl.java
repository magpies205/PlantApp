package com.example.plantapp.databinding;
import com.example.plantapp.R;
import com.example.plantapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDeliveryOrderBindingImpl extends FragmentDeliveryOrderBinding implements com.example.plantapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.delivery_options, 12);
        sViewsWithIds.put(R.id.imageView9, 13);
        sViewsWithIds.put(R.id.divider, 14);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDeliveryOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentDeliveryOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[10]
            , (android.widget.RadioGroup) bindings[12]
            , (android.view.View) bindings[14]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.Button) bindings[11]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            );
        this.cancelButton.setTag(null);
        this.five.setTag(null);
        this.fivePrice.setTag(null);
        this.free.setTag(null);
        this.freePrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.one.setTag(null);
        this.onePrice.setTag(null);
        this.seven.setTag(null);
        this.sevenPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.plantapp.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.example.plantapp.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.plantapp.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.example.plantapp.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.example.plantapp.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.plantapp.generated.callback.OnClickListener(this, 1);
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
        if (BR.orderDeliveryFragment == variableId) {
            setOrderDeliveryFragment((com.example.plantapp.ui.order.DeliveryOrderFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.plantapp.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderDeliveryFragment(@Nullable com.example.plantapp.ui.order.DeliveryOrderFragment OrderDeliveryFragment) {
        this.mOrderDeliveryFragment = OrderDeliveryFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.orderDeliveryFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.plantapp.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        java.lang.String viewModelPlantItemsOneName = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsFive = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsSeven = null;
        java.lang.String viewModelPlantItemsOneGetFormattedPrice = null;
        java.lang.String viewModelPlantItemsFiveName = null;
        java.util.Map<java.lang.String,com.example.plantapp.model.PlantItem> viewModelPlantItems = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        com.example.plantapp.ui.order.DeliveryOrderFragment orderDeliveryFragment = mOrderDeliveryFragment;
        com.example.plantapp.model.PlantItem viewModelPlantItemsOne = null;
        com.example.plantapp.model.PlantItem viewModelPlantItemsFree = null;
        java.lang.String viewModelSubtotalGetValue = null;
        java.lang.String viewModelPlantItemsFiveGetFormattedPrice = null;
        java.lang.String viewModelPlantItemsSevenGetFormattedPrice = null;
        java.lang.String viewModelPlantItemsFreeName = null;
        java.lang.String viewModelPlantItemsSevenName = null;
        com.example.plantapp.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelPlantItemsFreeGetFormattedPrice = null;

        if ((dirtyFlags & 0xdL) != 0) {



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
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.plantItems
                        viewModelPlantItems = viewModel.getPlantItems();
                    }


                    if (viewModelPlantItems != null) {
                        // read viewModel.plantItems["five"]
                        viewModelPlantItemsFive = viewModelPlantItems.get("five");
                        // read viewModel.plantItems["seven"]
                        viewModelPlantItemsSeven = viewModelPlantItems.get("seven");
                        // read viewModel.plantItems["one"]
                        viewModelPlantItemsOne = viewModelPlantItems.get("one");
                        // read viewModel.plantItems["free"]
                        viewModelPlantItemsFree = viewModelPlantItems.get("free");
                    }


                    if (viewModelPlantItemsFive != null) {
                        // read viewModel.plantItems["five"].name
                        viewModelPlantItemsFiveName = viewModelPlantItemsFive.getName();
                        // read viewModel.plantItems["five"].getFormattedPrice()
                        viewModelPlantItemsFiveGetFormattedPrice = viewModelPlantItemsFive.getFormattedPrice();
                    }
                    if (viewModelPlantItemsSeven != null) {
                        // read viewModel.plantItems["seven"].getFormattedPrice()
                        viewModelPlantItemsSevenGetFormattedPrice = viewModelPlantItemsSeven.getFormattedPrice();
                        // read viewModel.plantItems["seven"].name
                        viewModelPlantItemsSevenName = viewModelPlantItemsSeven.getName();
                    }
                    if (viewModelPlantItemsOne != null) {
                        // read viewModel.plantItems["one"].name
                        viewModelPlantItemsOneName = viewModelPlantItemsOne.getName();
                        // read viewModel.plantItems["one"].getFormattedPrice()
                        viewModelPlantItemsOneGetFormattedPrice = viewModelPlantItemsOne.getFormattedPrice();
                    }
                    if (viewModelPlantItemsFree != null) {
                        // read viewModel.plantItems["free"].name
                        viewModelPlantItemsFreeName = viewModelPlantItemsFree.getName();
                        // read viewModel.plantItems["free"].getFormattedPrice()
                        viewModelPlantItemsFreeGetFormattedPrice = viewModelPlantItemsFree.getFormattedPrice();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback5);
            this.five.setOnClickListener(mCallback2);
            this.free.setOnClickListener(mCallback4);
            this.nextButton.setOnClickListener(mCallback6);
            this.one.setOnClickListener(mCallback1);
            this.seven.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.five, viewModelPlantItemsFiveName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fivePrice, viewModelPlantItemsFiveGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.free, viewModelPlantItemsFreeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.freePrice, viewModelPlantItemsFreeGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.one, viewModelPlantItemsOneName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.onePrice, viewModelPlantItemsOneGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.seven, viewModelPlantItemsSevenName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sevenPrice, viewModelPlantItemsSevenGetFormattedPrice);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // orderDeliveryFragment != null
                boolean orderDeliveryFragmentJavaLangObjectNull = false;
                // orderDeliveryFragment
                com.example.plantapp.ui.order.DeliveryOrderFragment orderDeliveryFragment = mOrderDeliveryFragment;



                orderDeliveryFragmentJavaLangObjectNull = (orderDeliveryFragment) != (null);
                if (orderDeliveryFragmentJavaLangObjectNull) {


                    orderDeliveryFragment.goToNextScreen();
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



                    viewModel.setDelivery("free");
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



                    viewModel.setDelivery("five");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // orderDeliveryFragment != null
                boolean orderDeliveryFragmentJavaLangObjectNull = false;
                // orderDeliveryFragment
                com.example.plantapp.ui.order.DeliveryOrderFragment orderDeliveryFragment = mOrderDeliveryFragment;



                orderDeliveryFragmentJavaLangObjectNull = (orderDeliveryFragment) != (null);
                if (orderDeliveryFragmentJavaLangObjectNull) {


                    orderDeliveryFragment.cancelOrder();
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



                    viewModel.setDelivery("seven");
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



                    viewModel.setDelivery("one");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): orderDeliveryFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}