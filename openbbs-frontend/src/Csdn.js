import {useState} from 'react';
import {Button, Form, Input, message, Select} from 'antd';
import {SmileTwoTone} from "@ant-design/icons";
import {httpPost} from './http';
import "./App.css";

const {Option} = Select;

const Csdn = () => {
    const [school, setSchool] = useState('pku.edu.cn');
    const [email, setEmail] = useState('');
    const [address, setAddress] = useState('');


    const submit = () => {
        const url = '/submit';
        httpPost(url, {address: address, email: email}).then((response) => {
            return response.json();
        }).then((data) => {
            const {msg} = data;
            message.info(msg);
        }).catch(function (err) {
            alert(err);
        });
    }

    const onFinish = (values) => {
        submit();
    }

    const selectAfter = (
        <Select defaultValue="pku.edu.cn" className="select-after" onChange={(e) => {
            setSchool(e)
        }}>
            <Option value="pku.edu.cn">pku.edu.cn</Option>
            <Option value="thu.edu.cn">thu.edu.cn</Option>
            <Option value="ruc.edu.cn">ruc.edu.cn</Option>
        </Select>
    );

    return (
        <div className='csdn'>
            <Form
                name="basic"
                initialValues={{remember: true}}
                onFinish={onFinish}
                autoComplete="off"
            >
                <Form.Item
                    label="邮箱地址"
                    name="email"
                    rules={[{required: true, message: '请输入您的邮箱！（仅限北大、清华、人大邮箱后缀）'}]}
                >
                    <Input addonAfter={selectAfter} placeholder='请输入您的邮箱（仅限北大、清华、人大邮箱后缀）' onChange={(e) => {
                        setEmail(e.target.value + school);
                    }}/>
                </Form.Item>
                <Form.Item
                    label="csdn地址"
                    name="csdn"
                    rules={[{required: true, message: '请输入您要下载的csdn文件地址！'}]}
                >
                    <Input placeholder='请输入您要下载的csdn文件地址' onChange={(e) => {
                        setAddress(e.target.value);
                    }}/>
                </Form.Item>
                <Form.Item>
                    <Button type="primary" htmlType="submit">
                        <SmileTwoTone/>
                        提交
                    </Button>
                </Form.Item>
            </Form>
        </div>
    );
}

export default Csdn;