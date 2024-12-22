package com.example.doandidong1.data

import com.example.doandidong1.entity.Question

val sampleQuestions = listOf(
    // 1 - 10
    Question(
        questionText = "Phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại là gì?",
        options = listOf(
            "Phần mặt đường và lề đường.",
            "Phần đường xe chạy.",
            "Phần đường xe cơ giới."
        ),
        answer = 1,
        explain = "Phần đường xe chạy là phần của đường bộ được sử dụng cho phương tiện giao thông qua lại.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "“Làn đường” là gì?",
        options = listOf(
            "Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, sử dụng cho xe chạy.",
            "Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.",
            "Là đường cho xe ô tô chạy, dừng, đỗ an toàn."
        ),
        answer = 1,
        explain = "Làn đường có bề rộng đủ cho xe chạy an toàn.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trong các khái niệm dưới đây, “dải phân cách” được hiểu như thế nào là đúng?",
        options = listOf(
            "Là bộ phận của đường để ngăn cách không cho các loại xe vào những nơi không được phép.",
            "Là bộ phận của đường để phân tách phần đường xe chạy và hành lang an toàn giao thông.",
            "Là bộ phận của đường để phân chia mặt đường thành hai chiều xe chạy riêng biệt hoặc để phân chia phần đường của xe cơ giới và xe thô sơ."
        ),
        answer = 2,
        explain = "Dải phân cách phân chia mặt đường thành hai chiều xe chạy riêng biệt..",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "“Dải phân cách” trên đường bộ gồm những loại nào?",
        options = listOf(
            "Dải phân cách gồm loại cố định và loại di động.",
            "Dải phân cách gồm tường chống ồn, hộ lan cứng và hộ lan mềm.",
            "Dải phân cách gồm giá long môn và biển báo hiệu đường bộ."
        ),
        answer = 0,
        explain = "Dải phân cách gồm cố định và di động.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người lái xe được hiểu như thế nào trong các khái niệm dưới đây?",
        options = listOf(
            "Là người điều khiển xe cơ giới.",
            "Là người điều khiển xe thô sơ.",
            "Là người điều khiển xe có súc vật kéo."
        ),
        answer = 0,
        explain = "Người lái xe là người điều khiển xe cơ giới.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Đường mà trên đó phương tiện tham gia giao thông được các phương tiện giao thông đến từ các hướng khác nhường đường khi qua nơi đường giao nhau, được cắm biển báo hiệu đường ưu tiên là loại đường gì?",
        options = listOf(
            "Đường không ưu tiên.",
            "Đường tỉnh lộ.",
            "Đường quốc lộ.",
            "Đường ưu tiên."
        ),
        answer = 3,
        explain = "Đường ưu tiên được nhường đường khi qua nơi giao nhau.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khái niệm “phương tiện giao thông cơ giới đường bộ” được hiểu như thế nào là đúng?",
        options = listOf(
            "Gồm xe ô tô; máy kéo; xe mô tô hai bánh; xe mô tô ba bánh; xe gắn máy; xe cơ giới dùng cho người khuyết tật và xe máy chuyên dùng.",
            "Gồm ô tô; máy kéo; rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo; xe mô tô hai bánh; xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự."
        ),
        answer = 1,
        explain = "Phương tiện giao thông cơ giới không có xe máy chuyên dùng.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khái niệm “phương tiện giao thông thô sơ đường bộ” được hiểu như thế nào là đúng?",
        options = listOf(
            "Gồm xe đạp (kể cả xe đạp máy, xe đạp điện), xe xích lô, xe lăn dùng cho người khuyết tật, xe súc vật kéo và các loại xe tương tự.",
            "Gồm xe đạp (kể cả xe đạp máy, xe đạp điện), xe gắn máy, xe cơ giới dùng cho người khuyết tật và xe máy chuyên dùng.",
            "Gồm xe ô tô, máy kéo, rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo."
        ),
        answer = 0,
        explain = "Phương tiện giao thông thô sơ không có xe máy chuyên dùng; xe ô tô.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "“Phương tiện tham gia giao thông đường bộ” gồm những loại nào?",
        options = listOf(
            "Phương tiện giao thông cơ giới đường bộ.",
            "Phương tiện giao thông thô sơ đường bộ và xe máy chuyên dùng.",
            "Cả ý 1 và ý 2."
        ),
        answer = 2,
        explain = "Phương tiện giao thông gồm tất cả các loại phương tiện.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "“Người tham gia giao thông đường bộ” gồm những đối tượng nào?",
        options = listOf(
            "Người điều khiển, người sử dụng phương tiện tham gia giao thông đường bộ.",
            "Người điều khiển, dẫn dắt súc vật; người đi bộ trên đường bộ.",
            "Cả ý 1 và ý 2."
        ),
        answer = 2,
        explain = "Người tham gia giao thông gồm người sử dụng phương tiện và người đi bộ.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    // 11-20
    Question(
        questionText = "“Người điều khiển phương tiện tham gia giao thông đường bộ” gồm những đối tượng nào dưới đây?",
        options = listOf(
            "Người điều khiển xe cơ giới, người điều khiển xe thô sơ.",
            "Người điều khiển xe máy chuyên dùng tham gia giao thông đường bộ.",
            "Cả ý 1 và ý 2."
        ),
        answer = 2,
        explain = "Người điều khiển phương tiện gồm cả xe cơ giới và xe máy chuyên dùng.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khái niệm “người điều khiển giao thông” được hiểu như thế nào là đúng?",
        options = listOf(
            "Là người điều khiển phương tiện tham gia giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt.",
            "Là cảnh sát giao thông, người được giao nhiệm vụ hướng dẫn giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt.",
            "Là người tham gia giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt."
        ),
        answer = 1,
        explain = "Người điều khiển giao thông là cảnh sát giao thông.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trong các khái niệm dưới đây khái niệm “dừng xe” được hiểu như thế nào là đúng?",
        options = listOf(
            "Là trạng thái đứng yên của phương tiện giao thông không giới hạn thời gian để cho người lên, xuống phương tiện, xếp dỡ hàng hóa hoặc thực hiện công việc khác.",
            "Là trạng thái đứng yên tạm thời của phương tiện giao thông trong một khoảng thời gian cần thiết đủ để cho người lên, xuống phương tiện, xếp dỡ hàng hóa hoặc thực hiện công việc khác.",
            "Là trạng thái đứng yên của phương tiện giao thông không giới hạn thời gian giữa 02 lần vận chuyển hàng hóa hoặc hành khách."
        ),
        answer = 1,
        explain = "Dừng xe là đứng yên tạm thời.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khái niệm “đỗ xe” được hiểu như thế nào là đúng?",
        options = listOf(
            "Là trạng thái đứng yên của phương tiện giao thông có thời hạn trong một khoảng thời gian cần thiết đủ để cho người lên, xuống phương tiện, xếp dỡ hàng hóa hoặc thực hiện công việc khác.",
            "Là trạng thái đứng yên của phương tiện giao thông không giới hạn thời gian."
        ),
        answer = 1,
        explain = "Đỗ xe là đứng yên không giới hạn thời gian",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Cuộc đua xe chỉ được thực hiện khi nào?",
        options = listOf(
            "Diễn ra trên đường phố không có người qua lạI.",
            "Được người dân ủng hộ.",
            "Được cơ quan có thẩm quyền cấp phép"
        ),
        answer = 2,
        explain = "Cuộc đua xe cần cấp phép.",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Người điều khiển phương tiện giao thông đường bộ mà trong cơ thể có chất ma túy có bị nghiêm cấm hay không?",
        options = listOf(
            "Bị nghiêm cấm.",
            "Không bị nghiêm cấm",
            "Không bị nghiêm cấm, nếu có chất ma túy ở mức nhẹ, có thể điều khiển phương tiện tham gia giao thông."
        ),
        answer = 0,
        explain = "Có ma tuý bị nghiêm cấm",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Sử dụng rượu, bia khi lái xe, nếu bị phát hiện thì bị xử lý như thế nào?",
        options = listOf(
            "Chỉ bị nhắc nhở",
            "Bị xử phạt hành chính hoặc có thể bị xử lý hình sự tùy theo mức độ vi phạm",
            "Không bị xử lý hình sự."
        ),
        answer = 1,
        explain = "Sử dụng rượu, bia khi lái xe bị phạt hành chính hoặc xử lý hình sự.",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Theo luật phòng chống tác hại của rượu, bia, đối tượng nào dưới đây bị cấm sử dụng rượu, bia khi tham gia giao thông?",
        options = listOf(
            "Người điều khiển: Xe ô tô, xe mô tô, xe đạp, xe gắn máy",
            "Người ngồi phía sau người điều khiển xe cơ giới",
            "Người đi bộ.",
            "Cả ý 1 và ý 2."
        ),
        answer = 0,
        explain = "Người điều khiển bị cấm sử dụng rượu, bia khi tham gia giao thông.",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Hành vi điều khiển xe cơ giới chạy quá tốc độ quy định, giành đường, vượt ẩu có bị nghiêm cấm hay không?",
        options = listOf(
            "Bị nghiêm cấm tùy trường hợp",
            "Không bị nghiêm cấm",
            "Bị nghiêm cấm."
        ),
        answer = 2,
        explain = "",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Khi lái xe trong khu đô thị và đông dân cư trừ các khu vực có biển cấm sử dụng còi, người lái xe được sử dụng còi như thế nào trong các trường hợp dưới đây?",
        options = listOf(
            "Từ 22 giờ đêm đến 5 giờ sáng",
            "Từ 5 giờ sáng đến 22 giờ tối.",
            "Từ 23 giờ đêm đến 5 giờ sáng hôm sau"
        ),
        answer = 1,
        explain = "Chỉ sử dụng còi từ 5 giời sáng đến 22 giờ tối.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người lái xe sử dụng đèn như thế nào khi lái xe trong khu đô thị và đông dân cư vào ban đêm?",
        options = listOf(
            "Bất cứ đèn nào miễn là mắt nhìn rõ phía trước",
            "Chỉ bật đèn chiếu xa (đèn pha) khi không nhìn rõ đường",
            "Đèn chiếu xa (đèn pha) khi đường vắng, đèn pha chiếu gần (đèn cốt) khi có xe đi ngược chiều.",
            "Đèn chiếu gần (đèn cốt)."
        ),
        answer = 3,
        explain = "Trong đô thị sử dụng đèn chiếu gần",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trong trường hợp đặc biệt, để được lắp đặt, sử dụng còi, đèn không đúng với thiết kế của nhà sản xuất đối với từng loại xe cơ giới bạn phải đảm bảo yêu cầu nào dưới đây?",
        options = listOf(
            "Phải đảm bảo phụ tùng do đúng nhà sản xuất đó cung cấp",
            "Phải được chấp thuận của cơ quan có thẩm quyền.",
            "Phải là xe đăng ký và hoạt động tại các khu vực có địa hình phức tạp."
        ),
        answer = 1,
        explain = "Lắp đặt còi đèn không đúng thiết kế phải được chấp thuận của cơ quan có thẩm quyền.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Ở phần đường dành cho người đi bộ qua đường, trên cầu, đầu cầu, đường cao tốc, đường hẹp, đường dốc, tại nơi đường bộ giao nhau cùng mức với đường sắt có được quay đầu xe hay không?",
        options = listOf(
            "Được phép",
            "Không được phép.",
            "Tùy từng trường hợp."
        ),
        answer = 1,
        explain = "Không được phép quay đầu xe ở phần đường dành cho người đi bộ qua đường",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Bạn đang lái xe phía trước có một xe cảnh sát giao thông không phát tín hiệu ưu tiên bạn có được phép vượt hay không?",
        options = listOf(
            "Không được vượt.",
            "Được vượt khi đang đi trên cầu.",
            "Được phép vượt khi đi qua nơi giao nhau có ít phương tiện cùng tham gia giao thông.",
            "Được vượt khi đảm bảo an toàn."
        ),
        answer = 3,
        explain = "Được vượt khi xe không phát tín hiệu ưu tiên",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Bạn đang lái xe phía trước có một xe cứu thương đang phát tín hiệu ưu tiên bạn có được phép vượt hay không?",
        options = listOf(
            "Không được vượt",
            "Được vượt khi đang đi trên cầu.",
            "Được phép vượt khi đi qua nơi giao nhau có ít phương tiện cùng tham gia giao thông.",
            "Được vượt khi đảm bảo an toàn."
        ),
        answer = 0,
        explain = "Không được vượt khi đang phát tín hiệu ưu tiên.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người điều khiển xe mô tô hai bánh, ba bánh, xe gắn máy có được phép sử dụng xe để kéo hoặc đẩy các phương tiện khác khi tham gia giao thông không?",
        options = listOf(
            "Được phép",
            "Nếu phương tiện được kéo, đẩy có khối lượng nhỏ hơn phương tiện của mình.",
            "Tùy trường hợp.",
            "Không được phép."
        ),
        answer = 3,
        explain = "",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Khi điều khiển xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy, những hành vi buông cả hai tay; sử dụng xe để kéo, đẩy xe khác, vật khác; sử dụng chân chống của xe quệt xuống đường khi xe đang chạy có được phép hay không?",
        options = listOf(
            "Được phép.",
            "Tùy trường hợp.",
            "Không được phép."
        ),
        answer = 2,
        explain = "",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Khi điều khiển xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy, những hành vi nào không được phép?",
        options = listOf(
            "Buông cả hai tay; sử dụng xe để kéo, đẩy xe khác, vật khác; sử dụng chân chống của xe quệt xuống đường khi xe đang chạy.",
            "Buông một tay; sử dụng xe để chở người hoặc hàng hóa; để chân chạm xuống đất khi khởi hành.",
            "Đội mũ bảo hiểm; chạy xe đúng tốc độ quy định và chấp hành đúng quy tắc giao thông đường bộ.",
            "Chở người ngồi sau dưới 16 tuổi."
        ),
        answer = 0,
        explain = "",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Người ngồi trên xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy khi tham gia giao thông có được mang, vác vật cồng kềnh hay không?",
        options = listOf(
            "Được mang, vác tùy trường hợp cụ thể",
            "Không được mang, vác",
            "Được mang, vác nhưng phải đảm bảo an toàn.",
            "Được mang, vác tùy theo sức khỏe của bản thân."
        ),
        answer = 1,
        explain = "Xe mô tô không được mang vác vật cồng kềnh.",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Người ngồi trên xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy khi tham gia giao thông có được bám, kéo hoặc đẩy các phương tiện khác không?",
        options = listOf(
            "Được phép.",
            "Được bám trong trường hợp phương tiện của mình bị hỏng",
            "Được kéo, đẩy trong trường hợp phương tiện khác bị hỏng",
            "Không được phép."
        ),
        answer = 3,
        explain = "Xe mô tô không được kéo xe khác",
        type = "Lý Thuyết",
        isCritical = true
    ),
    //31-40
    Question(
        questionText = "Người ngồi trên xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy khi tham gia giao thông có được sử dụng ô khi trời mưa hay không?",
        options = listOf(
            "Được sử dụng",
            "Chỉ người ngồi sau được sử dụng.",
            "Không được sử dụng.",
            "Được sử dụng nếu không có áo mưa."
        ),
        answer = 2,
        explain = "Không được sử dụng ô",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Khi đang lên dốc người ngồi trên xe mô tô có được kéo theo người đang điều khiển xe đạp hay không?",
        options = listOf(
            "Chỉ được phép nếu cả hai đội mũ bảo hiểm.",
            "Không được phép.",
            "Chỉ được thực hiện trên đường thật vắng.",
            "Chỉ được phép khi người đi xe đạp đã quá mệt."
        ),
        answer = 1,
        explain = "Xe mô tô không được kéo xe khác",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Hành vi sử dụng xe mô tô để kéo, đẩy xe mô tô khác bị hết xăng đến trạm mua xăng có được phép hay không?",
        options = listOf(
            "Chỉ được kéo nếu đã nhìn thấy trạm xăng.",
            "Chỉ được thực hiện trên đường vắng phương tiện cùng tham gia giao thông.",
            "Không được phép."
        ),
        answer = 2,
        explain = "Xe mô tô không được kéo xe khác",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Hành vi vận chuyển đồ vật cồng kềnh bằng xe mô tô, xe gắn máy khi tham gia giao thông có được phép hay không?",
        options = listOf(
            "Không được vận chuyển.",
            "Chỉ được vận chuyển khi đã chằng buộc cẩn thận.",
            "Chỉ được vận chuyển vật cồng kềnh trên xe máy nếu khoảng cách về nhà ngắn hơn 2 km."
        ),
        answer = 0,
        explain = "Xe mô tô không được mang vác vật cồng kềnh.",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Người đủ bao nhiêu tuổi trở lên thì được điều khiển xe mô tô hai bánh, xe mô tô ba bánh có dung tích xi lanh từ 50 cm3 trở lên và các loại xe có kết cấu tương tự; xe ô tô tải, máy kéo có trọng tải dưới 3,5 tấn; xe ô tô chở người đến 9 chỗ ngồi?",
        options = listOf(
            "16 tuổi.",
            "18 tuổi.",
            "17 tuổi."
        ),
        answer = 1,
        explain = "Độ tuổi lấy bằng theo hạng (cách nhau 3 tuổi): 16: Xe dưới 50cm3; 18: Hạng A, B1, B2; 21: Hạng C, FB; 24: Hạng D, FC; 27: Hạng E, FD.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người đủ 16 tuổi được điều khiển các loại xe nào dưới đây?",
        options = listOf(
            "Xe mô tô 2 bánh có dung tích xi lanh từ 50 cm3 trở lên",
            "Xe gắn máy có dung tích xi lanh dưới 50 cm3.",
            "Xe ô tô tải dưới 3,5 tấn; xe chở người đến 9 chỗ ngồi.",
            "Tất cả các ý nêu trên."
        ),
        answer = 1,
        explain = "Độ tuổi lấy bằng theo hạng (cách nhau 3 tuổi): 16: Xe dưới 50cm3; 18: Hạng A, B1, B2; 21: Hạng C, FB; 24: Hạng D, FC; 27: Hạng E, FD.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người có giấy phép lái xe mô tô hạng A1 không được phép điều khiển loại xe nào dưới đây?",
        options = listOf(
            "Xe mô tô có dung tích xi lanh 125 cm3.",
            "Xe mô tô có dung tích xi lanh từ 175 cm3 trở lên.",
            "Xe mô tô có dung tích xi lanh 100 cm3."
        ),
        answer = 1,
        explain = "A1 mô tô dưới 175cm3 và xe 3 bánh của người khuyết tật; A2 mô tô 175cm3 trở lên; A3 xe 3 bánh.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người có giấy phép lái xe mô tô hạng A1 được phép điều khiển loại xe nào dưới đây?",
        options = listOf(
            "Xe mô tô hai bánh có dung tích xi lanh từ 50 cm3 đến dưới 175 cm3.",
            "Xe mô tô ba bánh dùng cho người khuyết tật.",
            "3.	Cả ý 1 và ý 2."
        ),
        answer = 2,
        explain = "A1 mô tô dưới 175cm3 và xe 3 bánh của người khuyết tật; A2 mô tô 175cm3 trở lên; A3 xe 3 bánh",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = ": Biển báo hiệu có dạng hình tròn, viền đỏ, nền trắng, trên nền có hình vẽ hoặc chữ số, chữ viết màu đen là loại biển gì dưới đây?",
        options = listOf(
            "Biển báo nguy hiểm",
            "Biển báo cấm",
            "Biển báo hiệu lệnh",
            "Biển báo chỉ dẫn."
        ),
        imageUrl = "cau39",
        answer = 1,
        explain = "Biển cấm: vòng tròn đỏ.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Biển báo hiệu có dạng tam giác đều, viền đỏ, nền màu vàng, trên có hình vẽ màu đen là loại biển gì dưới đây?",
        options = listOf(
            "Biển báo nguy hiểm",
            "Biển báo cấm.",
            "Biển báo hiệu lệnh.",
            "Biển báo chỉ dẫn."
        ),
        imageUrl = "cau40",
        answer = 0,
        explain = "Biển nguy hiểm: Hình tam giác vàng.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //41-50
    Question(
        questionText = "Biển báo hiệu hình tròn có nền xanh lam có hình vẽ màu trắng là loại biển gì dưới đây?",
        options = listOf(
            "Biển báo nguy hiểm",
            "Biển báo cấm",
            "Biển báo hiệu lệnh phải thi hành",
            "Biển báo chỉ dẫn"
        ),
        imageUrl = "cau41",
        answer = 2,
        explain = "Biển hiệu lệnh: Vòng tròn xanh",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Biển báo hiệu hình chữ nhật hoặc hình vuông hoặc hình mũi tên nền xanh lam là loại biển gì dưới đây?",
        options = listOf(
            "Biển báo nguy hiểm",
            "Biển báo cấm",
            "Biển báo hiệu lệnh phải thi hành",
            "Biển báo chỉ dẫn."
        ),
        imageUrl = "cau42",
        answer = 3,
        explain = "Biển chỉ dẫn: Hình vuông hoặc hình chữ nhật xanh",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi sử dụng giấy phép lái xe đã khai báo mất để điều khiển phương tiện cơ giới đường bộ, ngoài việc bị thu hồi giấy phép lái xe, chịu trách nhiệm trước pháp luật, người lái xe không được cấp giấy phép lái xe trong thời gian bao nhiêu năm?",
        options = listOf(
            "02 năm",
            "03 năm.",
            "05 năm.",
            "04 năm."
        ),
        answer = 2,
        explain = ": 05 năm không cấp lại nếu sử dụng bằng lái đã khai báo mất.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi gặp hiệu lệnh như dưới đây của cảnh sát giao thông thì người tham gia giao thông phải đi như thế nào là đúng quy tắc giao thông?",
        options = listOf(
            "Người tham gia giao thông ở các hướng phải dừng lại",
            "Người tham gia giao thông ở các hướng được đi theo chiều gậy chỉ của cảnh sát giao thông.",
            "Người tham gia giao thông ở phía trước và phía sau người điều khiển được đi tất cả các hướng; người tham gia giao thông ở phía bên phải và phía bên trái người điều khiển phải dừng lại.",
            "Người tham gia giao thông ở phía trước và phía sau người điều khiển phải dừng lại; người tham gia giao thông ở phía bên phải và phía bên trái người điều khiển được đi tất cả các hướng."
        ),
        imageUrl = "cau44",
        answer = 3,
        explain = "Người điều khiển giao thông tay giang ngang thì trước mặt và sau lưng dừng lại.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi gặp hiệu lệnh như dưới đây của cảnh sát giao thông thì người tham gia giao thông phải đi như thế nào là đúng quy tắc giao thông?",
        options = listOf(
            "Người tham gia giao thông ở hướng đối diện cảnh sát giao thông được đi, các hướng khác cần phải dừng lại.",
            "Người tham gia giao thông được rẽ phải theo chiều mũi tên màu xanh ở bục cảnh sát giao thông.",
            "Người tham gia giao thông ở các hướng đều phải dừng lại trừ các xe ở trong khu vực giao nhau.",
            "Người ở hướng đối diện cảnh sát giao thông phải dừng lại, các hướng khác được đi trong đó có bạn."
        ),
        imageUrl = "cau45",
        answer = 2,
        explain = "người điều khiển giao thông giơ tay thẳng đứng thì ở tất cả các hướng phải dừng lại.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Tại nơi có biển báo hiệu cố định lại có báo hiệu tạm thời thì người tham gia giao thông phải chấp hành hiệu lệnh của báo hiệu nào?",
        options = listOf(
            "Biển báo hiệu cố định.",
            "Báo hiệu tạm thời."
        ),
        answer = 1,
        explain = "ưu tiên biển báo tạm thời.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trên đường có nhiều làn đường cho xe đi cùng chiều được phân biệt bằng vạch kẻ phân làn đường, người điều khiển phương tiện phải cho xe đi như thế nào?",
        options = listOf(
            "Cho xe đi trên bất kỳ làn đường nào hoặc giữa hai làn đường nếu không có xe phía trước; khi cần thiết phải chuyển làn đường, người lái xe phải quan sát xe phía trước để bảo đảm an toàn.",
            "Phải cho xe đi trong một làn đường và chỉ được chuyển làn đường ở những nơi cho phép; khi chuyển làn phải có tín hiệu báo trước và phải bảo đảm an toàn.",
            "Phải cho xe đi trong một làn đường, khi cần thiết phải chuyển làn đường, người lái xe phải quan sát xe phía trước để bảo đảm an toàn."
        ),
        answer = 1,
        explain = "Chuyển làn đường phải có tín hiệu báo trước.",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "Trên đường một chiều có vạch kẻ phân làn đường, xe thô sơ và xe cơ giới phải đi như thế nào là đúng quy tắc giao thông?",
        options = listOf(
            "Xe thô sơ phải đi trên làn đường bên trái ngoài cùng, xe cơ giới, xe máy chuyên dùng đi trên làn đường bên phải.",
            "Xe thô sơ phải đi trên làn đường bên phải trong cùng, xe cơ giới, xe máy chuyên dùng đi trên làn đường bên trái.",
            "Xe thô sơ đi trên làn đường phù hợp không gây cản trở giao thông, xe cơ giới, xe máy chuyên dùng đi trên làn đường bên phải."
        ),
        answer = 1,
        explain = "Xe thô sơ phải đi làn đường bên phải trong cùng.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Bạn đang lái xe trong khu vực đô thi từ 22 giờ đến 5 giờ sáng hôm sau và cần vượt một xe khác, bạn cần báo hiệu như thế nào để đảm bảo an toàn giao thông?",
        options = listOf(
            "Phải báo hiệu bằng đèn hoặc còi.",
            "Chỉ được báo hiệu bằng còi.",
            "Phải báo hiệu bằng cả còi và đèn.",
            "Chỉ báo hiệu bằng đèn."
        ),
        answer = 3,
        explain = "Chỉ sử dụng còi từ 5 giờ sáng đến 22 giờ tối. Nên phải sử dụng đèn để báo hiệu.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi điều khiển xe chạy trên đường biết có xe sau xin vượt nếu đủ điều kiện an toàn người lái xe phải làm gì?",
        options = listOf(
            "Tăng tốc độ và ra hiệu cho xe sau vượt, không được gây trở ngại cho xe sau vượt.",
            "Người điều khiển phương tiện phía trước phải giảm tốc độ, đi sát về bên phải của phần đường xe chạy cho đến khi xe sau đã vượt qua, không được gây trở ngại cho xe sau vượt.",
            "Cho xe tránh về bên trái mình và ra hiệu cho xe sau vượt; nếu có chướng ngại vật phía trước hoặc thiếu điều kiện an toàn chưa cho vượt được phải ra hiệu cho xe sau biết; cấm gây trở ngại cho xe xin vượt."
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //51-60
    Question(
        questionText = "Khi muốn chuyển hướng, người lái xe phải thực hiện như thế nào để đảm bảo an toàn giao thông?",
        options = listOf(
            "Quan sát gương, ra tín hiệu, quan sát an toàn và chuyển hướng.",
            "Quan sát gương, giảm tốc độ, ra tín hiệu chuyển hướng, quan sát an toàn và chuyển hướng.\t",
            "Quan sát gương, tăng tốc độ, ra tín hiệu và chuyển hướng."
        ),
        answer = 1,
        explain = "Chuyển hướng phải giảm tốc độ.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi tránh xe đi ngược chiều, các xe phải nhường đường như thế nào là đúng quy tắc giao thông?",
        options = listOf(
            "Nơi đường hẹp chỉ đủ cho một xe chạy và có chỗ tránh xe thì xe nào ở gần chỗ tránh hơn phải vào vị trí tránh, nhường đường cho xe kia đi.",
            "Xe xuống dốc phải nhường đường cho xe đang lên dốc; xe nào có chướng ngại vật phía trước phải nhường đường cho xe không có chướng ngại vật đi trước.",
            "Xe lên dốc phải nhường đường cho xe xuống dốc; xe nào không có chướng ngại vật đi phía trước phải nhường đường cho xe có chướng ngại vật đi trước.",
            "Cả ý 1 và ý 2."
        ),
        answer = 3,
        explain = "Tránh xe ngược chiều thì nhường đường qua đường hẹp và nhường xe lên dốc.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Bạn đang lái xe trên đường hẹp, xuống dốc và gặp một xe đang đi lên dốc, bạn cần làm gì?",
        options = listOf(
            "Tiếp tục đi vì xe lên dốc phải nhường đường cho mình.",
            "Nhường đường cho xe lên dốc.",
            "Chỉ nhường đường khi xe lên dốc nháy đèn."
        ),
        answer = 1,
        explain = "Nhường đường cho xe lên dốc.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Tại nơi đường giao nhau, người lái xe đang đi trên đường không ưu tiên phải nhường đường như thế nào là đúng quy tắc giao thông?",
        options = listOf(
            "Nhường đường cho xe đi ở bên phải mình tới.",
            "Nhường đường cho xe đi ở bên trái mình tới.",
            "Nhường đường cho xe đi trên đường ưu tiên hoặc đường chính từ bất kỳ hướng nào tới."
        ),
        answer = 2,
        explain = "Đường không ưu tiên nhường đường cho xe trên đường ưu tiên.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Tại nơi đường giao nhau không có báo hiệu đi theo vòng xuyến, người điều khiển phương tiện phải nhường đường như thế nào là đúng quy tắc giao thông?",
        options = listOf(
            "Phải nhường đường cho xe đi đến từ bên phải.",
            "Xe báo hiệu xin đường trước xe đó được đi trước.",
            "Phải nhường đường cho xe đi đến từ bên trái."
        ),
        answer = 0,
        explain = "Giao nhau không có vòng xuyến thì nhường xe đến từ bên phải.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = ": Tại nơi đường bộ giao nhau cùng mức với đường sắt chỉ có đèn tín hiệu hoặc chuông báo hiệu, khi đèn tín hiệu màu đỏ đã bật sáng hoặc có tiếng chuông báo hiệu, người tham gia giao thông phải dừng lại ngay và giữ khoảng cách tối thiểu bao nhiêu mét tính từ ray gần nhất?",
        options = listOf(
            "5 mét.",
            "3 mét.",
            "4 mét."
        ),
        answer = 0,
        explain = "Đứng cách ray đường sắt 5m.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người điều khiển phương tiện tham gia giao thông trong hầm đường bộ ngoài việc phải tuân thủ các quy tắc giao thông còn phải thực hiện những quy định nào dưới đây?",
        options = listOf(
            "Xe cơ giới, xe máy chuyên dùng phải bật đèn; xe thô sơ phải bật đèn hoặc có vật phát sáng báo hiệu; chỉ được dùng xe, đỗ xe ở nơi quy định.",
            "Xe cơ giới phải bật đèn ngay cả khi đường hầm sáng; phải cho xe chạy trên một làn đường và chỉ chuyển làn ở nơi được phép; được quay đầu xe, lùi xe khi cần thiết.",
            "Xe máy chuyên dùng phải bật đèn ngay cả khi đường hầm sáng; phải cho xe chạy trên một làn đường và chỉ chuyển làn ở nơi được phép; được quay đầu xe, lùi xe khi cần thiết."
        ),
        answer = 0,
        explain = "Trong hầm chỉ đường dừng xe, đỗ xe ở nơi quy định.",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "Người ngồi trên xe mô tô 2 bánh, xe gắn máy phải đội mũ bảo hiểm có cài quai đúng quy cách khi nào?",
        options = listOf(
            "Khi tham gia giao thông đường bộ.",
            "Chỉ khi đi trên đường chuyên dùng; đường cao tốc.",
            "Khi tham gia giao thông trên đường tỉnh lộ hoặc quốc lộ."
        ),
        answer = 0,
        explain = "",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = ": Người điều khiển xe mô tô hai bánh, xe gắn máy được phép chở tối đa 2 người trong những trường hợp nào?",
        options = listOf(
            "Chở người bệnh đi cấp cứu; trẻ em dưới 14 tuổi.",
            "Áp giải người có hành vi vi phạm pháp luật.",
            "Cả ý 1 và ý 2."
        ),
        answer = 2,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người điều khiển xe mô tô hai bánh, xe gắn máy không được thực hiện những hành vi nào dưới đây?",
        options = listOf(
            "Đi vào phần đường dành cho người đi bộ và phương tiện khác; sử dụng ô, điện thoại di động, thiết bị âm thanh (trừ thiết bị trợ thính), đi xe dàn hàng ngang.",
            "Chở 02 người; trong đó, có người bị bệnh đi cấp cứu hoặc trẻ em dưới 14 tuổi hoặc áp giải người có hành vi vi phạm pháp luật.",
            "Điều khiển phương tiện tham gia giao thông trên đường tỉnh lộ hoặc quốc lộ."
        ),
        answer = 0,
        explain = "Xe mô tô 2 bánh không được đi vào phần đường cho người đi bộ.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //61-70
    Question(
        questionText = "Người điều khiển xe mô tô hai bánh, xe gắn máy có được đi xe dàn hàng ngang; xe đi vào phần đường dành cho người đi bộ và phương tiện khác; sử dụng ô, điện thoại di động, thiết bị âm thanh (trừ thiết bị trợ thính) hay không?",
        options = listOf(
            "Được phép nhưng phải đảm bảo an toàn.",
            "Không được phép.",
            "Được phép tùy từng hoàn cảnh, điều kiện cụ thể."
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Người lái xe phải giảm tốc độ thấp hơn tốc độ tối đa cho phép (có thể dừng lại một cách an toàn) trong trường hợp nào dưới đây?",
        options = listOf(
            "Khi có báo hiệu cảnh báo nguy hiểm hoặc có chướng ngại vật trên đường; khi chuyển hướng xe chạy hoặc tầm nhìn bị hạn chế; khi qua nơi đường giao nhau, nơi đường bộ giao nhau với đường sắt; đường vòng; đường có địa hình quanh co, đèo dốc.",
            "Khi qua cầu, cống hẹp; khi lên gần đỉnh dốc, khi xuống dốc, khi qua trường học, khu đông dân cư, khu vực đang thi công trên đường bộ; hiện trường xảy ra tai nạn giao thông.",
            "Khi điều khiển xe vượt xe khác trên đường quốc lộ, đường cao tốc.",
            "Cả ý 1 và ý 2."
        ),
        answer = 3,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = ": Tại ngã ba hoặc ngã tư không có đảo an toàn, người lái xe phải nhường đường như thế nào là đúng trong các trường hợp dưới đây?",
        options = listOf(
            "Nhường đường cho người đi bộ đang đi trên phần đường dành cho người đi bộ sang đường; nhường đường cho xe đi trên đường ưu tiên, đường chính từ bất kỳ hướng nào tới; nhường đường cho xe ưu tiên, xe đi từ bên phải đến.",
            "Nhường đường cho người đi bộ đang đứng chờ đi qua phần đường dành cho người đi bộ sang đường; nhường đường cho xe đi trên đường ngược chiều, đường nhánh từ bất kỳ hướng nào tới; nhường đường cho xe đi từ bên trái đến.",
            "Không phải nhường đường."
        ),
        answer = 0,
        explain = "Người lái xe phải nhường đường cho xe ưu tiên.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi điều khiển xe cơ giới, người lái xe phải bật đèn tín hiệu báo rẽ trong trường hợp nào sau đây?",
        options = listOf(
            "Khi cho xe chạy thẳng.",
            "Trước khi thay đổi làn đường.",
            "Sau khi thay đổi làn đường."
        ),
        answer = 1,
        explain = "Phải bật đèn tín hiệu rẽ trước khi thay đổi làn đường.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trên đoạn đường hai chiều không có giải phân cách giữa, người lái xe không được vượt xe khác trong các trường hợp nào dưới đây?",
        options = listOf(
            "Xe bị vượt bất ngờ tăng tốc độ và cố tình không nhường đường.",
            "Xe bị vượt giảm tốc độ và nhường đường.",
            "Phát hiện có xe đi ngược chiều.",
            "Cả ý 1 và ý 3."
        ),
        answer = 3,
        explain = "Không được vượt khi xe bị vượt bất ngờ tăng tốc hoặc phát hiện có xe đi ngược chiều.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người lái xe mô tô xử lý như thế nào khi cho xe mô tô phía sau vượt?",
        options = listOf(
            "Nếu đủ điều kiện an toàn, người lái xe phải giảm tốc độ, đi sát về bên phải của phần đường xe chạy cho đến khi xe sau đã vượt qua, không được gây trở ngại đối với xe xin vượt.",
            "Lái xe vào lề đường bên trái và giảm tốc độ để xe phía sau vượt qua, không được gây trở ngại đối với xe xin vượt.",
            "Nếu đủ điều kiện an toàn, người lái xe phải tăng tốc độ, đi sát về bên phải của phần đường chạy cho đến khi xe sau vượt qua."
        ),
        answer = 0,
        explain = "Xử lý cho xe sau vượt thì giảm tốc độ và đi về bên phải.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trong các trường hợp dưới đây, để bảo đảm an toàn khi tham gia giao thông, người lái xe mô tô cần thực hiện như thế nào?",
        options = listOf(
            "Phải đội mũ bảo hiểm đạt chuẩn, có cài quai đúng quy cách, mặc quần áo gọn gàng; không sử dụng ô, điện thoại di động, thiết bị âm thanh (trừ thiết bị trợ thính).",
            "Phải đội mũ bảo hiểm khi trời mưa gió hoặc trời quá nắng; có thể sử dụng ô, điện thoại di động, thiết bị âm thanh nhưng phải đảm bảo an toàn.",
            "Phải đội mũ bảo hiểm khi cảm thấy mất an toàn giao thông hoặc khi chuẩn bị di chuyển quãng đường xa."
        ),
        answer = 0,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "Đường bộ trong khu vực đông dân cư gồm những đoạn đường nào dưới đây?",
        options = listOf(
            "Là đoạn đường nằm trong khu công nghiệp có đông người và phương tiện tham gia giao thông và được xác định cụ thể bằng biển chỉ dẫn địa giới.",
            "Là đoạn đường bộ nằm trong khu vực nội thành phố, nội thị xã, nội thị trấn và những đoạn đường có đông dân cư sinh sống sát dọc theo đường, có các hoạt động ảnh hưởng đến an toàn giao thông; được xác định bằng biển báo hiệu là đường khu đông dân cư.",
            "Là đoạn đường nằm ngoài khu vực nội thành phố, nội thị xã có đông người và phương tiện tham gia giao thông và được xác định cụ thể bằng biển chỉ dẫn địa giới."
        ),
        answer = 1,
        explain = "Đường bộ trong khu vực đông dân cư được xác định bằng biển báo.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Tốc độ tối đa cho phép đối với xe máy chuyên dùng, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự trên đường bộ (trừ đường cao tốc) không được vượt quá bao nhiêu km/h?",
        options = listOf(
            "50 km/h.",
            "40 km/h.",
            "60 km/h."
        ),
        answer = 1,
        explain = "Xe gắn máy tối đa 40km/h.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trên đường bộ (trừ đường cao tốc) trong khu vực đông dân cư, đường đôi có dải phân cách giữa, xe mô tô hai bánh, ô tô chở người đến 30 chỗ tham gia giao thông với tốc độ tối đa cho phép là bao nhiêu?",
        options = listOf(
            "60 km/h.",
            "50 km/h.",
            "40 km/h."
        ),
        answer = 0,
        explain = "Có giải phân cách giữa thì được xem là đường đôi. Trong khu vực đông dân cư, đường đôi; đường một chiều có từ hai làn xe cơ giới trở lên: 60km/h.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //71-80
    Question(
        questionText = "Trên đường bộ (trừ đường cao tốc) trong khu vực đông dân cư, đường hai chiều không có dải phân cách giữa, xe mô tô hai bánh, ô tô chở người đến 30 chỗ tham gia giao thông với tốc độ tối đa cho phép là bao nhiêu?",
        options = listOf(
            "60 km/h.",
            "50 km/h.",
            "40 km/h."
        ),
        answer = 1,
        explain = "Trong khu vực đông dân cư, đường hai chiều; đường một chiều có một làn xe cơ giới: 50km/h.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trên đường bộ (trừ đường cao tốc) trong khu vực đông dân cư, đường hai chiều hoặc đường một chiều có một làn xe cơ giới, loại xe nào dưới đây được tham gia giao thông với tốc độ tối đa cho phép là 50 km/h?",
        options = listOf(
            "Ô tô con, ô tô tải, ô tô chỏ người trên 30 chỗ.",
            "Xe gắn máy, xe máy chuyên dùng.",
            "Cả ý 1 và ý 2."
        ),
        answer = 0,
        explain = "Xe cơ giới không bao gồm xe gắn máy. Trong khu vực đông dân cư, đường hai chiều; đường một chiều có một làn xe cơ giới: 50km/h.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi điều khiển xe chạy với tốc độ dưới 60 km/h, để đảm bảo khoảng cách an toàn giữa hai xe, người lái xe phải điều khiển xe như thế nào?",
        options = listOf(
            "Chủ động giữ khoảng cách an toàn phù hợp với xe chạy liền trước xe của mình.",
            "Đảm bảo khoảng cách an toàn theo mật độ phương tiện, tình hình giao thông thực tế.",
            "Cả ý 1 và ý 2."
        ),
        answer = 2,
        explain = "Khoảng cách an toàn dưới 60km/h: Chủ động và đảm bảo khoảng cách.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người lái xe phải giảm tốc độ thấp hơn tốc độ tối đa cho phép đến mức cần thiết, chú ý quan sát và chuẩn bị sẵn sàng những tình huống có thể xảy ra để phòng ngừa tai nạn trong các trường hợp nào dưới đây?",
        options = listOf(
            "Gặp biển báo nguy hiểm trên đường.",
            "Gặp biển chỉ dẫn trên đường.",
            "Gặp biển báo hết mọi lệnh cấm.",
            "Gặp biển báo hết hạn chế tốc độ tối đa cho phép."
        ),
        answer = 0,
        explain = "Giảm tốc độ, chú ý quan sát khi gặp biển báo nguy hiểm",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Các phương tiện tham gia giao thông đường bộ (kể cả những xe có quyền ưu tiên) đều phải dừng lại bên phải đường của mình và trước vạch “dừng xe” tại các điểm giao cắt giữa đường bộ và đường sắt khi có báo hiệu dừng nào dưới đây?",
        options = listOf(
            "Hiệu lệnh của nhân viên gác chắn.",
            "Đèn đỏ sáng nháy, cờ đỏ, biển đỏ.",
            "Còi, chuông kêu, chắn đã đóng.",
            "Tất cả các ý trên."
        ),
        answer = 3,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Tác dụng của mũ bảo hiểm đối với người ngồi trên xe mô tô hai bánh trong trường hợp xảy ra tai nạn giao thông là gì?",
        options = listOf(
            "Để làm đẹp.",
            "Để tránh mưa nắng.",
            "Để giảm thiểu chấn thương vùng đầu.",
            "Để các loại phương tiện khác dễ quan sát."
        ),
        answer = 2,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Tại nơi đường giao nhau, người lái xe đang đi trên đường không ưu tiên phải xử lý như thế nào là đúng quy tắc giao thông?",
        options = listOf(
            "Tăng tốc độ qua đường giao nhau để đi trước xe đi trên đường ưu tiên.",
            "Giảm tốc độ qua đường giao nhau để đi trước xe đi trên đường ưu tiên.",
            "Nhường đường cho xe đi trên ưu tiên từ bất kỳ hướng nào tới."
        ),
        answer = 2,
        explain = "Đứng cách ray đường sắt 5m",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "Người lái xe phải xử lý như thế nào khi quan sát phía trước thấy người đi bộ đang sang đường tại nơi có vạch đường dành cho người đi bộ để đảm bảo an toàn?",
        options = listOf(
            "Giảm tốc độ, đi từ từ để vượt qua trước người đi bộ.",
            "Giảm tốc độ, có thể dừng lại nếu cần thiết trước vạch dừng xe để nhường đường cho người đi bộ qua đường.",
            "Tăng tốc độ để vượt qua trước người đi bộ."
        ),
        answer = 1,
        explain = "Nơi có vạch kẻ đường dành cho người đi bộ thì nhường đường.",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Theo Luật Giao thông đường bộ, tín hiệu đèn giao thông gồm 3 màu nào dưới đây?",
        options = listOf(
            "Đỏ – Vàng – Xanh.",
            "Cam – Vàng – Xanh.",
            "Vàng – Xanh dương – Xanh lá.",
            "Đỏ – Cam – Xanh."
        ),
        answer = 0,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Tại nơi đường giao nhau, khi đèn điều khiển giao thông có tín hiệu màu vàng, người điều khiển giao thông phải chấp hành như thế nào là đúng quy tắc giao thông?",
        options = listOf(
            "Phải cho xe dừng lại trước vạch dừng, trường hợp đã đi quá vạch dừng hoặc đã quá gần vạch dừng nếu dừng lại thấy nguy hiểm thì được đi tiếp.",
            "Trong trường hợp tín hiệu vàng nhấp nháy là được đi nhưng phải giảm tốc độ, chú ý quan sát nhường đường cho người đi bộ qua đường.",
            "Nhanh chóng tăng tốc độ, vượt qua nút giao và chú ý đảm bảo an toàn.",
            "Cả ý 1 và ý 2."
        ),
        answer = 3,
        explain = "Đèn vàng dừng lại trước vạch dừng hoặc nhấp nháy thì đi chậm.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //81-90
    Question(
        questionText = "Để báo hiệu cho xe phía trước biết xe mô tô của bạn muốn vượt, bạn phải có tín hiệu như thế nào dưới đây?",
        options = listOf(
            "Ra tín hiệu bằng tay rồi cho xe vượt qua.",
            "Tăng ga mạnh để gây sự chú ý rồi cho xe vượt qua.",
            "Bạn phải có tín hiệu bằng đèn hoặc còi."
        ),
        answer = 2,
        explain = "Muốn vượt xe thì phải báo hiệu bằng đèn hoặc còi.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Người điều khiển xe mô tô phải giảm tốc độ và hết sức thận trọng khi qua những đoạn đường nào dưới đây?",
        options = listOf(
            "Đường ướt, đường có sỏi cát trên nền đường.",
            "Đường hẹp có nhiều điểm giao cắt từ hai phía.",
            "Đường đèo dốc, vòng liên tục.",
            "Tất cả các ý nêu trên."
        ),
        answer = 3,
        explain = "Giảm tốc độ trên đường ướt, đường hẹp và đèo dốc.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi gặp xe buýt đang dừng đón, trả khách, người điều khiển xe mô tô phải xử lý như thế nào dưới đây để đảm bảo an toàn giao thông?",
        options = listOf(
            "Tăng tốc độ để nhanh chóng vượt qua bến đỗ.",
            "Giảm tốc độ đến mức an toàn có thể và quan sát người qua đường và từ từ vượt qua xe buýt.",
            "Yêu cầu phải dừng lại phía sau xe buýt chờ xe rời bến mới đi tiếp."
        ),
        answer = 1,
        explain = "Xe buýt đang dừng đón trả khách thì giảm tốc độ và từ từ vượt qua xe buýt.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khái niệm về văn hóa giao thông được hiểu như thế nào là đúng?",
        options = listOf(
            "Là sự hiểu biết và chấp hành nghiêm chỉnh pháp luật về giao thông; là ý thức trách nhiệm với cộng đồng khi tham gia giao thông.",
            "Là ứng xử có văn hóa, có tình yêu thương con người trong các tình huống không may xảy ra khi tham gia giao thông.",
            "Cả ý 1 và ý 2."
        ),
        answer = 2,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trong các hành vi dưới đây, người lái xe mô tô có văn hóa giao thông phải ứng xử như thế nào?",
        options = listOf(
            "Điều khiển xe đi bên phải theo chiều đi của mình; đi đúng phần đường, làn đường quy định; đội mũ bảo hiểm đạt chuẩn, cài quai đúng quy định.",
            "Điều khiển xe đi trên phần đường, làn đường có ít phương tiện tham gia giao thông.",
            "Điều khiển xe và đội mũ bảo hiểm ở nơi có biển báo bắt buộc đội mũ bảo hiểm."
        ),
        answer = 0,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Trong các hành vi dưới đây, người lái xe ô tô, mô tô có văn hóa giao thông phải ứng xử như thế nào?",
        options = listOf(
            "Điều khiển xe đi bên phải theo chiều đi của mình; đi đúng phần đường, làn đường quy định; dừng, đỗ xe đúng nơi quy định; đã uống rượu, bia thì không lái xe.",
            "Điều khiển xe đi trên phần đường, làn đường có ít phương tiện giao thông; dừng xe, đỗ xe ở nơi thuận tiện hoặc theo yêu cầu của hành khách, của người thân.",
            "Dừng và đỗ xe ở nơi thuận tiện cho việc chuyên chở hành khách và giao nhận hàng hóa; sử dụng ít rượu, bia thì có thể lái xe."
        ),
        answer = 0,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi xảy ra tai nạn giao thông, có người bị thương nghiêm trọng, người lái xe và người có mặt tại hiện trường vụ tai nạn phải thực hiện các công việc gì dưới đây?",
        options = listOf(
            "Thực hiện sơ cứu ban đầu trong trường hợp khẩn cấp; thông báo vụ tai nạn đến cơ quan thi hành pháp luật.",
            "Nhanh chóng lái xe gây tai nạn hoặc đi nhờ xe khác ra khỏi hiện tượng vụ tai nạn.",
            "Cả ý 1 và ý 2."
        ),
        answer = 2,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "Trên đường đang xảy ra ùn tắc có những hành vi nào sau đây là thiếu văn hóa khi tham gia giao thông?",
        options = listOf(
            "Bấm còi liên tục thúc giục các phương tiện phía trước nhường đường.",
            "Đi lên vỉa hè, tận dùng mọi khoảng trống để nhanh chóng thoát khỏi nơi ùn tắc.",
            "Lấn sàng trái đường cố gắng vượt lên xe khác.",
            "Tất cả các ý nêu trên."
        ),
        answer = 3,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi điều khiển xe mô tô tay ga chạy xuống đường dốc dài, độ dốc cao, người lái xe cần thực hiện những thao tác nào dưới đây để đảm bảo an toàn?",
        options = listOf(
            "Giữ tay ga ở mức độ phù hợp, sử dụng phanh trước và phanh sau để giảm tốc độ.",
            "Nhả hết tay ga, tắt động cơ, sử dụng phanh trước và phanh sau để giảm tốc độ.",
            "Sử dụng phanh trước để giảm tốc độ kết hợp tắt chìa khóa điện của xe."
        ),
        answer = 0,
        explain = "Xe mô tô xuống dốc dài cần sử dụng cả phanh trước và phanh sau để giảm tốc độ.",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Khi quay đầu xe, người lái xe cần phải quan sát và thực hiện các thao tác nào để đảm bảo an toàn giao thông?",
        options = listOf(
            "Quan sát biển báo hiệu để biết nơi được phép quay đầu; quan sát kỹ địa hình nơi chọn để quay đầu; lựa chọn quỹ đạo quay đầu xe cho thích hợp; quay đầu xe với tốc độ thấp; thường xuyên báo tín hiệu để người, các phương tiện xung quanh được biết; nếu quay đầu xe ở nơi nguy hiểm thì đưa đầu xe về phía nguy hiểm đưa đuôi xe về phía an toàn.",
            "Quan sát biển báo hiệu để biết nơi được phép quay đầu; quan sát kỹ địa hình nơi chọn để quay đầu; lựa chọn quỹ đạo quay đầu xe; quay đầu xe với tốc độ tối đa; thường xuyên báo tín hiệu để người, các phương tiện xung quanh được biết; nếu quay đầu xe ở nơi nguy hiểm thì đưa đuôi xe về phía nguy hiểm và đầu xe về phía an toàn."
        ),
        answer = 0,
        explain = "Thực hiện quay đầu xe với tốc độ thấp.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //91-100
    Question(
        questionText = "Khi tránh nhau trên đường hẹp, người lái xe cần phải chú ý những điểm nào để đảm bảo an toàn giao thông?",
        options = listOf(
            "Không nên đi cố vào đường hẹp; xe đi ở phía sườn núi nên dừng lại trước để nhường đường; khi dừng xe nhường đường phải đỗ ngay ngắn.",
            "Trong khi tránh nhau không nơi đổi số; khi tránh nhau ban đêm, phải tắt đèn pha bật đèn cốt.",
            "Khi tránh nhau ban đêm, phải thường xuyên bật đèn pha tắt đèn cốt.",
            "Cả ý 1 và ý 2."
        ),
        answer = 3,
        explain = "Cả ý 1 và 2 đều đúng. Ý 3 tránh nhau ban đêm bật đèn pha là sai.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi điều khiển xe trên đường vòng người lái xe cần phải làm gì để đảm bảo an toàn?",
        options = listOf(
            "Quan sát cẩn thận các chướng ngại vật và báo hiệu bằng còi, đèn; giảm tốc độ tới mức cần thiết, về số thấp và thực hiện quay vòng với tốc độ phù hợp với bán kính cong của đường vòng.",
            "Quan sát cẩn thận các chướng ngại vật và báo hiệu bằng còi, đèn; tăng tốc để nhanh chóng qua đường vòng và giảm tốc độ sau khi qua đường vòng."
        ),
        answer = 0,
        explain = "Điều khiển xe trên đường vòng cần giảm tốc độ",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Để đạt được hiệu quả phanh cao nhất, người lái xe mô tô phải sử dụng các kỹ năng như thế nào dưới đây?",
        options = listOf(
            "Sử dụng phanh trước.",
            "Sử dụng phanh sau.",
            "Giảm hết ga; sử dụng đồng thời cả phanh sau và phanh trước."
        ),
        answer = 2,
        explain = "Khi phanh xe mô tô thì giảm hết ga.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi đang lái xe mô tô và ô tô, nếu có nhu cầu sử dụng điện thoại để nhắn tin hoặc gọi điện, người lái xe phải thực hiện như thế nào trong các tình huống nêu dưới đây?",
        options = listOf(
            "Giảm tốc độ để đảm bảo an toàn với xe phía trước và sử dụng điện thoại để liên lạc.",
            "Giảm tốc độ để dừng xe ở nơi cho phép dừng xe sau đó sử dụng điện thoại để liên lạc.",
            "Tăng tốc độ để cách xa xe phía sau và sử dụng điện thoại để liên lạc."
        ),
        answer = 1,
        explain = "Khi cần nghe điện thoại thì giảm tốc độ và dừng xe ở nơi cho phép dừng xe.",
        type = "Lý Thuyết",
        isCritical = true
    ),
    Question(
        questionText = "Những thói quen nào dưới đây khi điều khiển xe mô tô tay ga tham gia giao thông dễ gây tai nạn nguy hiểm?",
        options = listOf(
            "Sử dụng còi.",
            "Phanh đồng thời cả phanh trước và phanh sau.",
            "Chỉ sử dụng phanh trước."
        ),
        answer = 2,
        explain = "Xe mô tô tay ga chỉ sử dụng phanh trước thì rất nguy hiểm.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Khi điều khiển xe mô tô quay đầu người lái xe cần thực hiện như thế nào để đảm bảo an toàn?",
        options = listOf(
            "Bật tín hiệu báo rẽ trước khi quay đầu, từ từ giảm tốc độ đến mức có thể dừng lại.",
            "Chỉ quay đầu xe ở những nơi được phép quay đầu.",
            "Quan sát an toàn các phương tiện tới từ phía trước, phía sau, hai bên đồng thời nhường đường cho xe từ bên phải và phía trước đi tới.",
            "Tất cả các ý nêu trên."
        ),
        answer = 3,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Tay ga trên xe mô tô hai bánh có tác dụng gì trong các trường hợp dưới đây?",
        options = listOf(
            "Để điều khiển xe chạy về phía trước.",
            "Để điều tiết công suất động cơ qua đó điều khiển tốc độ của xe.",
            "Để điều khiển xe chạy lùi.",
            "Cả ý 1 và ý 2."
        ),
        answer = 3,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "Gương chiếu hậu của xe mô tô hai bánh có tác dụng gì trong các trường hợp dưới đây?",
        options = listOf(
            "Để quan sát an toàn phía bên trái khi chuẩn bị rẽ trái.",
            "Để quan sát an toàn phía bên phải khi chuẩn bị rẽ phải.",
            "Để quan sát an toàn phía sau cả bên trái và bên phải trước khi chuyển hướng.",
            "Để quan sát an toàn phía trước cả bên trái và bên phải trước khi chuyển hướng."
        ),
        answer = 2,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Để đảm bảo an toàn khi tham gia giao thông, người lái xe mô tô hai bánh cần điều khiển tay ga như thế nào trong các trường hợp dưới đây?",
        options = listOf(
            "Tăng ga thật nhanh, giảm ga từ từ.",
            "Tăng ga thật nhanh, giảm ga thật nhanh.",
            "Tăng ga từ từ, giảm ga thật nhanh.",
            "Tăng ga từ từ, giảm ga từ từ.",
        ),
        answer = 2,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "Kỹ thuật cơ bản để giữ thăng bằng khi điều khiển xe mô tô đi trên đường gồ ghề như thế nào trong các trường hợp dưới đây?",
        options = listOf(
            "Đứng thẳng trên giá gác chân lái sau đó hơi gập đầu gối và khuỷu tay, đi chậm để không nẩy quá mạnh.",
            "Ngồi lùi lại phía sau, tăng ga vượt nhanh qua đoạn đường xóc.",
            "Ngồi lệch sang bên trái hoặc bên phải để lấy thăng bằng qua đoạn đường gồ ghề."
        ),
        answer = 0,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //101-110
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //111-120
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //121-130
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //131-140
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //141-150
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //151-160
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //161-170
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //171-180
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //181-190
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    //191-200
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "",
        options = listOf(
            "",
            ""
        ),
        answer = 1,
        explain = "",
        type = "Lý Thuyết",
        isCritical = false
    ),





)