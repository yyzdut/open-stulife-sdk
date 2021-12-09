import {Menu, PageHeader} from "antd";
import {useState} from "react";
import {AppstoreOutlined, MailOutlined} from "@ant-design/icons";
import Csdn from './Csdn';
import Codimd from './Codimd';
import "./App.css";


const App = () => {

    const [csdnVisible, setCsdnVisible] = useState(true);
    const [current, setCurrent] = useState("1");


    const LeftMenu = () => {
        return (
            <Menu style={{width: 300}} selectedKeys={[current]}>
                <Menu.Item
                    key="1"
                    icon={<MailOutlined/>}
                    onClick={(e) => {
                        setCsdnVisible(true);
                        setCurrent(e.key);
                    }}
                >
                    csdn free download(csdn免费下载)
                </Menu.Item>
                <Menu.Item
                    key="2"
                    icon={<AppstoreOutlined/>}
                    onClick={(e) => {
                        setCsdnVisible(false);
                        setCurrent(e.key);
                    }}
                >
                    codimd(轻量级的在线文档协作工具)
                </Menu.Item>
            </Menu>
        );
    };


    return (
        <div className="App">
            <PageHeader
                className="site-page-header"
                title="Welcome!"
                subTitle="By Yjx"
            />
            <div className="main-wrapper">
                <LeftMenu/>
                {csdnVisible ? <Csdn/> : <Codimd/>}
            </div>
        </div>
    );
};

export default App;