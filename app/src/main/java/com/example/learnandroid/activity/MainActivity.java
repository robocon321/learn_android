package com.example.learnandroid.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.learnandroid.R;
import com.example.learnandroid.utils.Course;

public class MainActivity extends AppCompatActivity {
    Button btnLayout, btnRandomExercise, btnChangeImage, btnComponent, btnGameCuocDua;
    Button btnListViewBasic, btnListViewAdvance, btnGridView, btnCustomComponent, btnGlobal;
    Button btnShowPopupMenu, btnShowContextMenu, btnAlertDialog, btnCustomDialog;
    Button btnDateDialog, btnIntent, btnSendMessage, btnCall, btnIntentData, btnCamera;
    Button btnGameChooseImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        setEvents();
        registerForContextMenu(btnShowContextMenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.learn_menu, menu);
        menu.setHeaderTitle("Please choose");
        menu.setHeaderIcon(R.drawable.edit);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menuAbout)
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
        else if(item.getItemId() == R.id.menuContact)
            Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show();
        else if(item.getItemId() == R.id.menuClose)
            Toast.makeText(this, "Close", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Child", Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.learn_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menuAbout)
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
        else if(item.getItemId() == R.id.menuContact)
            Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show();
        else if(item.getItemId() == R.id.menuClose)
            Toast.makeText(this, "Close", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Child", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    public void addControls(){
        btnLayout = findViewById(R.id.btnLayout);
        btnRandomExercise = findViewById(R.id.btnRandomExercise);
        btnChangeImage = findViewById(R.id.btnChangeImage_parent);
        btnComponent = findViewById(R.id.btnComponent);
        btnGameCuocDua = findViewById(R.id.btnGameCuocDua);
        btnListViewBasic = findViewById(R.id.btnListViewBasic);
        btnListViewAdvance = findViewById(R.id.btnListViewAdvance);
        btnGridView = findViewById(R.id.btnGridView);
        btnCustomComponent = findViewById(R.id.btnCustomComponent);
        btnCustomComponent = findViewById(R.id.btnCustomComponent);
        btnGlobal = findViewById(R.id.btnGlobal);
        btnShowPopupMenu = findViewById(R.id.btnShowPopupMenu);
        btnShowContextMenu = findViewById(R.id.btnShowContextMenu);
        btnAlertDialog = findViewById(R.id.btnAlertDialog);
        btnCustomDialog = findViewById(R.id.btnCustomDialog);
        btnDateDialog = findViewById(R.id.btnDateDialog);
        btnIntent = findViewById(R.id.btnIntent);
        btnSendMessage = findViewById(R.id.btnSendMessage);
        btnCall = findViewById(R.id.btnCall);
        btnIntentData = findViewById(R.id.btnIntentData);
        btnCamera = findViewById(R.id.btnCamera);
        btnGameChooseImage = findViewById(R.id.btnGameChooseImage);
    }

    public void setEvents(){
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, LayoutActivity.class);
                startActivity(intent);
            }
        });

        btnRandomExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RandomNumberActivity.class);
                startActivity(intent);
            }
        });

        btnChangeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChangeImageActivity.class);
                startActivity(intent);
            }
        });

        btnComponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComponentActivity.class);
                startActivity(intent);
            }
        });

        btnGameCuocDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameCuocDuaKiThuActivity.class);
                startActivity(intent);
            }
        });

        btnListViewBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewBasicActivity.class);
                startActivity(intent);
            }
        });

        btnListViewAdvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewAdvanceActivity.class);
                startActivity(intent);
            }
        });

        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        btnCustomComponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomComponentActivity.class);
                startActivity(intent);
            }
        });

        btnGlobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GlobalAppActivity.class);
                startActivity(intent);
            }
        });

        btnShowPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnShowPopupMenu);
                popupMenu.getMenuInflater().inflate(R.menu.learn_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId() == R.id.menuAbout)
                            Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                        else if(item.getItemId() == R.id.menuContact)
                            Toast.makeText(MainActivity.this, "Contact", Toast.LENGTH_SHORT).show();
                        else if(item.getItemId() == R.id.menuClose)
                            Toast.makeText(MainActivity.this, "Close", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(MainActivity.this, "Child", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setIcon(R.drawable.android);
                alert.setTitle("This is title");
                alert.setMessage("This is message");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });

        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.activity_global_app);
                EditText editUname = dialog.findViewById(R.id.editGlobalUname);
                EditText editPwd = dialog.findViewById(R.id.editGlobalPwd);
                Button btnSubmit = dialog.findViewById(R.id.btnGlobal);
                btnSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, editUname.getText()+"\t"+editPwd.getText(), Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

        btnDateDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DateAndTimePickerDialogActivity.class);
                startActivity(intent);
            }
        });

        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntentBundleActivity.class);
                intent.putExtra("int", 3);
                intent.putExtra("string", "Hello world");
                intent.putExtra("arr", new String[]{"ha","hi"});
                intent.putExtra("obj", new Course("course",33,33));

                Bundle bundle = new Bundle();
                bundle.putInt("bundle_int",3);
                bundle.putSerializable("bundle_obj", new Course("course",44,22));

                intent.putExtra("bundle", bundle);
                startActivity(intent);
            }
        });

        btnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.putExtra("sms_body","Hello world");
                intent.setData(Uri.parse("sms:0354512411"));
                startActivity(intent);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 111);
            }
        });

        btnIntentData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SendIntentDataResultActivity.class);
                startActivity(intent);
            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UseCameraImageActivity.class);
                startActivity(intent);
            }
        });

        btnGameChooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameChooseImageActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == 111 && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:0354512411"));
            startActivity(intent);
        }else{
            Toast.makeText(this, "K cho phep", Toast.LENGTH_SHORT).show();
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}