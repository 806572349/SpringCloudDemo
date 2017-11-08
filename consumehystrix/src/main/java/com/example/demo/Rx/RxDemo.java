package com.example.demo.Rx;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by 80657 on 2017/11/7.
 */
public class RxDemo {

    public Observable<String> Testobservable() {
        //创建事件源
       /* Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("hello");
                subscriber.onNext("hahahahha");
                subscriber.onCompleted();

            }
        });*/
        Observable<String> observable=Observable.create(subscriber -> {
            subscriber.onNext("sda");
            subscriber.onNext("sad");
            subscriber.onNext("hello");

        });
        return observable;
    }

    public Subscriber<String> TestSubscriber() {
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("subscriber" + s);
            }
        };
        return subscriber;
    }
    public void SubDo(){
        Testobservable().subscribe(TestSubscriber());


    }


}
