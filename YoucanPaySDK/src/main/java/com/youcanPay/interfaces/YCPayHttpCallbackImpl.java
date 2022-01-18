package com.youcanPay.interfaces;

import com.youcanPay.models.YCPayResponse;

public interface YCPayHttpCallbackImpl {
    void onResponse(YCPayResponse response);

    void onError(String message);
}
