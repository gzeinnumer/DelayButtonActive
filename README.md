# DelayButtonActive

```java
Button button = findViewById(R.id.btn);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        button.setEnabled(false);
        button.setText("Wait 4 second...");

        new Handler().postDelayed(() -> {
            button.setEnabled(true);
            button.setText("Click Me");
        }, 4000);
    }
});
```

---

```
Copyright 2021 M. Fadli Zein
```