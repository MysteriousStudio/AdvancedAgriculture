## 作物品质系统

设计作物品质系统的初衷是为了改变目前Minecraft作物生长中过于简化的逻辑. 但是这个品质系统可能也会变得又长又臭十分难以开发. 所以仅在此写下我的想法.

首先我们将作物划分为四个等级, 分别是石, 铁, 金, 钻石.每种不同品质的作物都有不同的效果.

- 石质作物将是最基础的作物类型, 在任何耕地上种植作物后收获时将有极大概率收获到此类作物. 这种作物不会被村民所接受, 同时不能用于制作食物, 也不能直接食用. 此类作物主要的用途是作为种子.
- 铁质作物品质等级比石质高一级, 在任何耕地上种植作物后收获时有很小概率收获此类作物，或在水井周围的土地种植大概率获得. 这类作物开始能被村民所接受, 但售出价格较低. 此类作物能用于制作食物, 但回复量较低, 且自身不能直接食用.
- 金质作物的获取较为复杂, 在普通耕地上并不能直接获取此类作物. 此类作物需要在与其相邻的水井中投入适量的肥料方可概率获得. 此类作物的售出价格较铁质作物高, 同时可以直接食用, 或者制作为其他食物, 回复量较高.
- 钻石质作物的获取更为复杂, 在金质作物管理方法上可以极小概率获取. 或者将其种植在腐殖土开垦的耕地上辅以金质作物管理方式增加获取概率. 此类作物售出价格高于金质作物, 在金质作物的基础上自身及制作出的食物回复量更高.
- 红石质作物不能由种植获得，需要与村民交易方可获得。此类作物通常用于合成而非食用。

细节部分

- 由于在初期作物管理变得不那么现实, 你在初期将很难以模组农作物来作为食物. 不过, 肉类可能是你的一个选择. 不止是鸡牛猪羊和腐肉, 还可以食用鱼类. 作物品质的出现使得初期鱼类成为主要食物来源.
- 不适量的肥料将使作物品质下降, 耕地性质发生变化.
- 腐殖土会退化.
- 同种等级的同种农作物可以堆叠, 但不同品质的作物不能堆叠.(背包:我现在害怕极了)
- 作物品质将会在物品信息中表现.
- 作物品质影响堆肥效率.
- 骨粉不能催熟模组新添加的作物.

  机制
- 水井可以访问所有范围内作物信息和土壤肥力信息，并由其更新
- 作物通过水井获取肥力信息,其中肥力信息有三个值NPK即氮磷钾. 不同作物对三个值变化的反应不同,如叶类作物需要更多氮,块茎类需要更多钾,块根类需要更多磷等.
- 品质的计算(待定)通过一些公式进行运算,每次运算后的结果将累加,并决定最终的品质.并不是所有作物都要在同一时间计算并累加作物品质,可以选取一定量的随机作物. 此计算与水井有关. 运算结果将更新至作物
- 水井中储存的肥力信息,并据时间以及水井管理的所有作物通过运算得出结果后递减. 此信息同样不需实时处理. 同样由水井处理.
- 土壤的酸化和板结和腐殖土的退化同样由水井管理
- 作物品质累加公式(待定)
- 肥力衰减公式(待定)

## 机器部分

  漂洗机的机制

- 漂洗机的功能是漂洗草木灰,酸化/板结土
- 漂洗机需要水,漂洗需要放入铲子(?)并右键,漂洗完成输出液体，同时铲子消耗耐久
- 输出的液体可以装入蒸发器
- 漂洗机还可以用于混合固体和流体

  蒸发器的机制
- 蒸发器顾名思义是用于蒸发液体溶剂的玩意
- 放置在地上并加入流体,花一点时间即可获得产物
- 放置在热源(火/篝火/岩浆)上可以加快速度

  鱼栅的机制

- 新加入的作物品质机制改变了初期获取食物的难度,这个时候你可能需要一些鱼来度过这段日子
- 放置在河流/海洋群系中以工作,加入鱼饵(待实现)以加快鱼的获取速度
- 你可能需要时不时移动鱼栅的位置来获得最大效率

  机器组的机制
-  机器组由是由机器组框架组成的多方块结构,在构建机器组时放入的机器将决定机器组的功能.
-  AA预置几种常见的机器组,用于高效地执行特定任务,避免因为机器和物流造成性能下降.
-  机器组相当于一个机器以优化性能.
-  机器组可以由社区定制.

## 新的机制

  ### 管道系统（可选扩展）

- 所有管道储存在[管道套管]中,管道套管同样可以用于传输能量
- 管道套管拥有小于一个方块的模型
- 手持工具右键可打开管道套管的GUI
- GUI可以用于配置管道连接方式(颜色标记),使得管道套管可以放入多种管道
- 手持管道右键管道套管将管道加入管道套管中
- 手持方块右键将套管塞进方块里,通过工具可以移除上面的方块
- 套管枢纽用于汇聚/分散不同标记的管道

  农业自动化
- 添加新的”矿车“，可以用于自动灌溉，施肥，收割等等
- 添加矿车装卸自动化流程
- 添加作物管理机（多方块结构），用于后期作物自动化管理，可以连接新增的“矿车”来实现功能
  
  ### 能量系统
  
  AA的能量系统将与其他工业类模组略有区别.  
  能量单位:LF,光能通量.    
  顾名思义,在AA中,能量以光为主要载体,基于光的特性,能量在传输时的行为会有不同.  
  光能与电能的转换由导体核心完成,不同的导体核心转换能量的能力和损耗各有不同.  
  导体核心类似于光电池和激光器的结合体,在收到光能时表现为光电池,在收到电能时表现为激光器.  
  鉴于光的特性,在早期,光能的传输可以不需要管道.  
  对于光能的分配,在光的路径上设置透镜即可完成.
  导体核心的输入和输出是恒定的.  
  对于作为光电池的导体核心,如果能量需求小于输入的能量,多余部分将会浪费.  
  对于作为激光器的导体核心,如果输入的能量不足以让其连续工作,放出的光将表现为脉冲形式,每次放出固定量的能量.  
  由于液态阳光的加入,我们也可以使用流体管道来传输大量能量,因为液态阳光的能量密度很高.  
  但液态阳光的生产完全不能脱离植物,所以为了把大量能量转化成液态阳光,需要大型树场,或者生物反应器.  

  