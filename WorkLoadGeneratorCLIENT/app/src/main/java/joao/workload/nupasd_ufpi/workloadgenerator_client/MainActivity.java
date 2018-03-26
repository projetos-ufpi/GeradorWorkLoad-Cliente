package joao.workload.nupasd_ufpi.workloadgenerator_client;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextViewReplyFromServer;
    private EditText mEditTextSendMessage;
    private Button SalvarIP, GerarCarga01, GerarCarga02, GerarCarga03, GerarCarga04, GerarCarga05, GerarCarga06, GerarCarga07, GerarCarga08, GerarCarga09, GerarCarga10, GerarCarga11, GerarCarga12;
    private EditText edt_ip_config;

    String ip_destino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button buttonSend = (Button) findViewById(R.id.btn_send);

        //mEditTextSendMessage = (EditText) findViewById(R.id.edt_send_message);
        mTextViewReplyFromServer = (TextView) findViewById(R.id.tv_reply_from_server);
        SalvarIP = (Button) findViewById(R.id.btn_Salva_ip);
        edt_ip_config = (EditText) findViewById(R.id.edt_ip_config);
        GerarCarga01 = (Button) findViewById(R.id.button2);
        GerarCarga02 = (Button) findViewById(R.id.button3);
        GerarCarga03 = (Button) findViewById(R.id.button4);
        GerarCarga04 = (Button) findViewById(R.id.button5);
        GerarCarga05 = (Button) findViewById(R.id.button6);
        GerarCarga06 = (Button) findViewById(R.id.button7);
        GerarCarga07 = (Button) findViewById(R.id.button8);
        GerarCarga08 = (Button) findViewById(R.id.button9);
        GerarCarga09 = (Button) findViewById(R.id.button10);
        GerarCarga10 = (Button) findViewById(R.id.button11);
        GerarCarga11 = (Button) findViewById(R.id.button12);
        GerarCarga12 = (Button) findViewById(R.id.button13);

        GerarCarga01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("100");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });


        //Gera Carga 02 - 1000 palavras
        GerarCarga02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("1000");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });





        //Gera Carga 03 - 10k
        GerarCarga03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("10k");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });









        //Gera Carga 04 - 100k
        GerarCarga04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("100k");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });










        //Gera Carga 05 - 1M
        GerarCarga05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("1m");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });










        //Gera Carga 06 - 2M
        GerarCarga06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("2m");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });





        //Gera Carga 07 - 4M
        GerarCarga07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("4m");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });












        //Gera Carga 08
        GerarCarga08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("5m");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });










        //Gera Carga 09
        GerarCarga09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("8m");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });








        //Gera Carga 10
        GerarCarga10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("10m");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });









        //Gera Carga 11
        GerarCarga11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("15m");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });








        //Gera Carga 12
        GerarCarga12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Handler handler = new Handler();
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            //Replace below IP with the IP of that device in which server socket open.
                            //If you change port then change the port number in the server side code also.
                            //Socket s = new Socket("192.168.0.104", 9002);//
                            Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                            OutputStream out = s.getOutputStream();

                            PrintWriter output = new PrintWriter(out);

                            output.println("20m");
                            output.flush();
                            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                            final String st = input.readLine();

                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    String s = mTextViewReplyFromServer.getText().toString();
                                    if (st.trim().length() != 0)
                                        //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                        mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                                }
                            });

                            output.close();
                            out.close();
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                thread.start();







            }
        });










        //Salvar o IP destino aqui
        SalvarIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ip_destino = edt_ip_config.getText().toString();
            }
        });


       // buttonSend.setOnClickListener(this);


        if (Build.VERSION.SDK_INT >= 23 && (ActivityCompat.checkSelfPermission(MainActivity.this,
                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)) {

            ActivityCompat.requestPermissions(MainActivity.this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION,
                    android.Manifest.permission.INTERNET, android.Manifest.permission.ACCESS_WIFI_STATE,
                    android.Manifest.permission.READ_PHONE_STATE, android.Manifest.permission.ACCESS_NETWORK_STATE,
                    android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.RECEIVE_BOOT_COMPLETED,
                    android.Manifest.permission.WAKE_LOCK
            }, 0);
        }


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_send:
                sendMessage(mEditTextSendMessage.getText().toString());
                break;
        }
    }

    private void sendMessage(final String msg) {

        final Handler handler = new Handler();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    //Replace below IP with the IP of that device in which server socket open.
                    //If you change port then change the port number in the server side code also.
                    //Socket s = new Socket("192.168.0.104", 9002);//
                    Socket s = new Socket(ip_destino, 9002);//Adicionando o IP configurável aqui

                    OutputStream out = s.getOutputStream();

                    PrintWriter output = new PrintWriter(out);

                    output.println(msg);
                    output.flush();
                    BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    final String st = input.readLine();

                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            String s = mTextViewReplyFromServer.getText().toString();
                            if (st.trim().length() != 0)
                                //ABAIXO ESTÁ A RESPOSTA DOR SERVIDOR PARA O CLIENTE
                                mTextViewReplyFromServer.setText(s + "\nResposta Server: " + st);
                        }
                    });

                    output.close();
                    out.close();
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}