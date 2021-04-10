IO流（输入输出流）：完成硬盘文件的读写。

	分类方式有：

		一种方式是按照流的方向进行分类：

		另一种方式是按照读取数据方式不同进行分类：

			有的流是按照字节的方式读取数据，一次读取1个字节byte，等同于一次读取8个比特位。这种文件读取方式是万能的，什么类型的文件都可以读取。包括：文本、图片、声音、视频等。

			有的流是按照字符的方式读取数据的，一次读取一个字符，这种流是为了方便读取普通文件而存在的。这种流不能读取：图片、视频、声音等。只能读取纯文本文件，连word文件都无法读取。

-->IO流在Java中的实现：（以Stream结尾的属于字节流，以 er 结尾的属于字符流。）

	java.io.InputStream;  // 字节输入流

	java.io.OnputStream;  // 字节输出流

	java.io.Reader;  // 字符输入流

	java.io.Writer.  // 字符输出流

	！！！这四个类都是抽象的类。（1）所有的流都是可关闭的，都有.close()方法。用完流，一定要关闭。（2）所有的输出流都是可刷新的（实现了flushable接口），都有flush()方法。输出流在最终输出之后，一定要记得.flush()刷新一下。这个刷新表示将通道/管道当中剩余的数据强行输出，清空管道。

-->java.io包下需要掌握的16个流：



	文件专属：

	java.io.FileInputStream

	java.io.FileOutputStream

	java.io.FileReader

	java.io.FileWriter



	转换流（将字节流转换成字符流）：

	java.io.InputStreamReader

	java.io.InputStreamWriter



	缓冲流专属：

	java.io.BufferedReader

	java.io.BufferedWriter

	java.io.BufferedInputStream

	java.io.BufferedOutputStream



	数据流专属：

	java.io.DataInputStream

	java.io.DataOutputStream



	标准输出流：

	java.io.ObjectInputStream

	java.io.ObjectOutputStream



	对象专属流：

	java.io.PrintWriter

	java.io.PrintStream

！！！测试找相应的源代码chapter23。

	--->java.io.FileInputStream

		int .read(byte[] bytes); // 返回int 数据类型，将读取到的个数返回；

		int .read(); // 返回int数据类型，将读取到的数据转换成int类型。

		int available();  //  返回流当中剩余的没有读到的字节数量；

		long skip(long n);  // 跳过几个字节不读。

	--->java.io.FileOutputStream

	文件字节输出流，负责写。从内存到硬盘。一定记住，要刷新.flush()。

-->java.io.FileReader和java.io.FileWriter用法和上面两个类似。