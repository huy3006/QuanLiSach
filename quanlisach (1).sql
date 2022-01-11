-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2022 at 04:43 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlisach`
--

-- --------------------------------------------------------

--
-- Table structure for table `chi_tiet_hd`
--

CREATE TABLE `chi_tiet_hd` (
  `ma_chitiet` int(11) NOT NULL,
  `ma_sach` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ten_sach` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `so_luong` int(100) DEFAULT NULL,
  `don_gia` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `thanh_tien` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ma_hd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chi_tiet_hd`
--

INSERT INTO `chi_tiet_hd` (`ma_chitiet`, `ma_sach`, `ten_sach`, `so_luong`, `don_gia`, `thanh_tien`, `ma_hd`) VALUES
(39, 'a002', 'Đắc nhân tâm', 5, '400.0', '2000.000', 'c001'),
(40, 'a003', 'Đừng bận tâm', 3, '300.0', '900.000', 'c001'),
(41, 'a004', 'Sống thanh thản', 8, '200.0', '1600.000', 'c001'),
(42, 'a001', 'Hạt giống tâm hồn', 4, '700.0', '2800.000', 'c003');

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `ma_hd` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ngaytao` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tongtien` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ten_kh` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `diachi_kh` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `sdt_kh` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ma_nv` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`ma_hd`, `ngaytao`, `tongtien`, `ten_kh`, `diachi_kh`, `sdt_kh`, `ma_nv`) VALUES
('c001', '18/12/2021', '7500.000', 'Nguyễn Văn A', 'Hà Nam', '0978804850', '2'),
('c003', '15/12/2021', '2800.000', 'Nguyễn Văn A', 'Hà Nam', '0978804850', '2');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `ma_nv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ten_nv` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Ngaysinh_nv` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Gioitinh_nv` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Sdt_nv` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Diachi_nv` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`ma_nv`, `ten_nv`, `Ngaysinh_nv`, `Gioitinh_nv`, `Sdt_nv`, `Diachi_nv`) VALUES
('1', 'Nguyễn Quốc Huy', '30/06/2000', 'Nam', '0964045230', 'Hà Nam'),
('2', 'Nguyễn Thiện Đô', '24/01/2000', 'Nam', '097645323', 'Vĩnh Phúc'),
('3', 'Vũ Anh Thắng', '07/05/1990', 'Nam', '0945678458', 'Nghệ An'),
('a', 'Nguyễn Quốc Hưng', '30/06/2000', 'Nữ', '0964045230', 'Hà Nam'),
('a006', 'Phạm Mạnh Hùng', '24/01/2000', 'Nam', '097645323', 'Bến Tr');

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap` (
  `Maphieunhap` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ma_nv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Masach` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Soluong` int(11) NOT NULL,
  `Gianhap` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Ngaynhap` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phieunhap`
--

INSERT INTO `phieunhap` (`Maphieunhap`, `ma_nv`, `Masach`, `Soluong`, `Gianhap`, `Ngaynhap`) VALUES
('b001', '2', 'a001', 2, '800.000', '2021-12-15'),
('b002', '1', 'a006', 7, '700.000', '2021-12-12');

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE `sach` (
  `Masach` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Tensach` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Theloai` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Soluong` int(11) NOT NULL,
  `Giaban` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `NXB` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Tacgia` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sach`
--

INSERT INTO `sach` (`Masach`, `Tensach`, `Theloai`, `Soluong`, `Giaban`, `NXB`, `Tacgia`) VALUES
('a001', 'Hạt giống tâm hồn', 'Văn học nước ngoài', 1, '700.0', 'Kim Đồng', 'Nguyễn Thiện Đô'),
('a002', 'Đắc nhân tâm', 'Văn học nước ngoài', 1, '400.0', 'Văn Lang', 'Trần Nguyệt Ánh'),
('a003', 'Đừng bận tâm', 'Văn học nước ngoài', 1, '300.0', 'Hà Nội', 'Hồ Trung Dũng'),
('a004', 'Sống thanh thản', 'Văn học nước ngoài', 1, '200.0', 'Hồ Chí Minh', 'Nguyễn Cao Kỳ Duyên');

-- --------------------------------------------------------

--
-- Table structure for table `sachnhap`
--

CREATE TABLE `sachnhap` (
  `Masach` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Tensachnhap` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NXB` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tacgia` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sachnhap`
--

INSERT INTO `sachnhap` (`Masach`, `Tensachnhap`, `NXB`, `tacgia`) VALUES
('a001', 'Hạt giống tâm hồn', 'Kim Đồng', 'Nguyễn Thiện Đô'),
('a002', 'Đắc nhân tâm', 'Văn Lang', 'Trần Nguyệt Ánh'),
('a003', 'Đừng bận tâm', 'Hà Nội', 'Hồ Trung Dũng'),
('a004', 'Sống thanh thản', 'Hồ Chí Minh', 'Nguyễn Cao Kỳ Duyên'),
('a005', 'Học lập trình căn bản', 'Kim Đồng', 'Ngô Bá Sơn'),
('a006', 'Tự học lập trình', 'Kim đồng', 'Trran thi lan');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(100) NOT NULL,
  `username` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `chucvu` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `chucvu`) VALUES
(1, 'admin', '1', 'quanli'),
(2, 'nhanvien', '1', 'nhanvien');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chi_tiet_hd`
--
ALTER TABLE `chi_tiet_hd`
  ADD PRIMARY KEY (`ma_chitiet`),
  ADD KEY `chitiet` (`ma_hd`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`ma_hd`),
  ADD KEY `nhanviens` (`ma_nv`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`ma_nv`);

--
-- Indexes for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`Maphieunhap`,`Masach`,`Ngaynhap`),
  ADD KEY `phieunhap_nv` (`ma_nv`),
  ADD KEY `phieunhap_sachnhap` (`Masach`);

--
-- Indexes for table `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`Masach`);

--
-- Indexes for table `sachnhap`
--
ALTER TABLE `sachnhap`
  ADD PRIMARY KEY (`Masach`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chi_tiet_hd`
--
ALTER TABLE `chi_tiet_hd`
  MODIFY `ma_chitiet` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chi_tiet_hd`
--
ALTER TABLE `chi_tiet_hd`
  ADD CONSTRAINT `chitiet` FOREIGN KEY (`ma_hd`) REFERENCES `hoadon` (`ma_hd`);

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `nhanviens` FOREIGN KEY (`ma_nv`) REFERENCES `nhanvien` (`ma_nv`);

--
-- Constraints for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_nv` FOREIGN KEY (`ma_nv`) REFERENCES `nhanvien` (`ma_nv`),
  ADD CONSTRAINT `phieunhap_sachnhap` FOREIGN KEY (`Masach`) REFERENCES `sachnhap` (`Masach`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
