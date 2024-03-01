# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MacsecKeyAssociationArgs', 'MacsecKeyAssociation']

@pulumi.input_type
class MacsecKeyAssociationArgs:
    def __init__(__self__, *,
                 connection_id: pulumi.Input[str],
                 cak: Optional[pulumi.Input[str]] = None,
                 ckn: Optional[pulumi.Input[str]] = None,
                 secret_arn: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MacsecKeyAssociation resource.
        :param pulumi.Input[str] connection_id: The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
        :param pulumi.Input[str] cak: The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
        :param pulumi.Input[str] ckn: The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
        :param pulumi.Input[str] secret_arn: The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
               
               > **Note:** `ckn` and `cak` are mutually exclusive with `secret_arn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secret_arn`. If you use the `secret_arn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
        """
        pulumi.set(__self__, "connection_id", connection_id)
        if cak is not None:
            pulumi.set(__self__, "cak", cak)
        if ckn is not None:
            pulumi.set(__self__, "ckn", ckn)
        if secret_arn is not None:
            pulumi.set(__self__, "secret_arn", secret_arn)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Input[str]:
        """
        The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter
    def cak(self) -> Optional[pulumi.Input[str]]:
        """
        The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
        """
        return pulumi.get(self, "cak")

    @cak.setter
    def cak(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cak", value)

    @property
    @pulumi.getter
    def ckn(self) -> Optional[pulumi.Input[str]]:
        """
        The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
        """
        return pulumi.get(self, "ckn")

    @ckn.setter
    def ckn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ckn", value)

    @property
    @pulumi.getter(name="secretArn")
    def secret_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.

        > **Note:** `ckn` and `cak` are mutually exclusive with `secret_arn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secret_arn`. If you use the `secret_arn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
        """
        return pulumi.get(self, "secret_arn")

    @secret_arn.setter
    def secret_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_arn", value)


@pulumi.input_type
class _MacsecKeyAssociationState:
    def __init__(__self__, *,
                 cak: Optional[pulumi.Input[str]] = None,
                 ckn: Optional[pulumi.Input[str]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 secret_arn: Optional[pulumi.Input[str]] = None,
                 start_on: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MacsecKeyAssociation resources.
        :param pulumi.Input[str] cak: The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
        :param pulumi.Input[str] ckn: The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
        :param pulumi.Input[str] connection_id: The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
        :param pulumi.Input[str] secret_arn: The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
               
               > **Note:** `ckn` and `cak` are mutually exclusive with `secret_arn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secret_arn`. If you use the `secret_arn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
        :param pulumi.Input[str] start_on: The date in UTC format that the MAC Security (MACsec) secret key takes effect.
        :param pulumi.Input[str] state: The state of the MAC Security (MACsec) secret key. The possible values are: associating, associated, disassociating, disassociated. See [MacSecKey](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_MacSecKey.html#DX-Type-MacSecKey-state) for descriptions of each state.
        """
        if cak is not None:
            pulumi.set(__self__, "cak", cak)
        if ckn is not None:
            pulumi.set(__self__, "ckn", ckn)
        if connection_id is not None:
            pulumi.set(__self__, "connection_id", connection_id)
        if secret_arn is not None:
            pulumi.set(__self__, "secret_arn", secret_arn)
        if start_on is not None:
            pulumi.set(__self__, "start_on", start_on)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter
    def cak(self) -> Optional[pulumi.Input[str]]:
        """
        The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
        """
        return pulumi.get(self, "cak")

    @cak.setter
    def cak(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cak", value)

    @property
    @pulumi.getter
    def ckn(self) -> Optional[pulumi.Input[str]]:
        """
        The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
        """
        return pulumi.get(self, "ckn")

    @ckn.setter
    def ckn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ckn", value)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter(name="secretArn")
    def secret_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.

        > **Note:** `ckn` and `cak` are mutually exclusive with `secret_arn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secret_arn`. If you use the `secret_arn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
        """
        return pulumi.get(self, "secret_arn")

    @secret_arn.setter
    def secret_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_arn", value)

    @property
    @pulumi.getter(name="startOn")
    def start_on(self) -> Optional[pulumi.Input[str]]:
        """
        The date in UTC format that the MAC Security (MACsec) secret key takes effect.
        """
        return pulumi.get(self, "start_on")

    @start_on.setter
    def start_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_on", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the MAC Security (MACsec) secret key. The possible values are: associating, associated, disassociating, disassociated. See [MacSecKey](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_MacSecKey.html#DX-Type-MacSecKey-state) for descriptions of each state.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


class MacsecKeyAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cak: Optional[pulumi.Input[str]] = None,
                 ckn: Optional[pulumi.Input[str]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 secret_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a MAC Security (MACSec) secret key resource for use with Direct Connect. See [MACsec prerequisites](https://docs.aws.amazon.com/directconnect/latest/UserGuide/direct-connect-mac-sec-getting-started.html#mac-sec-prerequisites) for information about MAC Security (MACsec) prerequisites.

        Creating this resource will also create a resource of type `secretsmanager.Secret` which is managed by Direct Connect. While you can import this resource into your state, because this secret is managed by Direct Connect, you will not be able to make any modifications to it. See [How AWS Direct Connect uses AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/integrating_how-services-use-secrets_directconnect.html) for details.

        > **Note:** All arguments including `ckn` and `cak` will be stored in the raw state as plain-text.
        **Note:** The `secret_arn` argument can only be used to reference a previously created MACSec key. You cannot associate a Secrets Manager secret created outside of the `directconnect.MacsecKeyAssociation` resource.

        ## Example Usage
        ### Create MACSec key with CKN and CAK

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.directconnect.get_connection(name="tf-dx-connection")
        test = aws.directconnect.MacsecKeyAssociation("test",
            connection_id=example.id,
            ckn="0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef",
            cak="abcdef0123456789abcdef0123456789abcdef0123456789abcdef0123456789")
        ```
        ### Create MACSec key with existing Secrets Manager secret

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.directconnect.get_connection(name="tf-dx-connection")
        example_get_secret = aws.secretsmanager.get_secret(name="directconnect!prod/us-east-1/directconnect/0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef")
        test = aws.directconnect.MacsecKeyAssociation("test",
            connection_id=example.id,
            secret_arn=example_get_secret.arn)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cak: The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
        :param pulumi.Input[str] ckn: The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
        :param pulumi.Input[str] connection_id: The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
        :param pulumi.Input[str] secret_arn: The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
               
               > **Note:** `ckn` and `cak` are mutually exclusive with `secret_arn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secret_arn`. If you use the `secret_arn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MacsecKeyAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a MAC Security (MACSec) secret key resource for use with Direct Connect. See [MACsec prerequisites](https://docs.aws.amazon.com/directconnect/latest/UserGuide/direct-connect-mac-sec-getting-started.html#mac-sec-prerequisites) for information about MAC Security (MACsec) prerequisites.

        Creating this resource will also create a resource of type `secretsmanager.Secret` which is managed by Direct Connect. While you can import this resource into your state, because this secret is managed by Direct Connect, you will not be able to make any modifications to it. See [How AWS Direct Connect uses AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/integrating_how-services-use-secrets_directconnect.html) for details.

        > **Note:** All arguments including `ckn` and `cak` will be stored in the raw state as plain-text.
        **Note:** The `secret_arn` argument can only be used to reference a previously created MACSec key. You cannot associate a Secrets Manager secret created outside of the `directconnect.MacsecKeyAssociation` resource.

        ## Example Usage
        ### Create MACSec key with CKN and CAK

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.directconnect.get_connection(name="tf-dx-connection")
        test = aws.directconnect.MacsecKeyAssociation("test",
            connection_id=example.id,
            ckn="0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef",
            cak="abcdef0123456789abcdef0123456789abcdef0123456789abcdef0123456789")
        ```
        ### Create MACSec key with existing Secrets Manager secret

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.directconnect.get_connection(name="tf-dx-connection")
        example_get_secret = aws.secretsmanager.get_secret(name="directconnect!prod/us-east-1/directconnect/0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef")
        test = aws.directconnect.MacsecKeyAssociation("test",
            connection_id=example.id,
            secret_arn=example_get_secret.arn)
        ```

        :param str resource_name: The name of the resource.
        :param MacsecKeyAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MacsecKeyAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cak: Optional[pulumi.Input[str]] = None,
                 ckn: Optional[pulumi.Input[str]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 secret_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MacsecKeyAssociationArgs.__new__(MacsecKeyAssociationArgs)

            __props__.__dict__["cak"] = cak
            __props__.__dict__["ckn"] = ckn
            if connection_id is None and not opts.urn:
                raise TypeError("Missing required property 'connection_id'")
            __props__.__dict__["connection_id"] = connection_id
            __props__.__dict__["secret_arn"] = secret_arn
            __props__.__dict__["start_on"] = None
            __props__.__dict__["state"] = None
        super(MacsecKeyAssociation, __self__).__init__(
            'aws:directconnect/macsecKeyAssociation:MacsecKeyAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cak: Optional[pulumi.Input[str]] = None,
            ckn: Optional[pulumi.Input[str]] = None,
            connection_id: Optional[pulumi.Input[str]] = None,
            secret_arn: Optional[pulumi.Input[str]] = None,
            start_on: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None) -> 'MacsecKeyAssociation':
        """
        Get an existing MacsecKeyAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cak: The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
        :param pulumi.Input[str] ckn: The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
        :param pulumi.Input[str] connection_id: The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
        :param pulumi.Input[str] secret_arn: The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.
               
               > **Note:** `ckn` and `cak` are mutually exclusive with `secret_arn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secret_arn`. If you use the `secret_arn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
        :param pulumi.Input[str] start_on: The date in UTC format that the MAC Security (MACsec) secret key takes effect.
        :param pulumi.Input[str] state: The state of the MAC Security (MACsec) secret key. The possible values are: associating, associated, disassociating, disassociated. See [MacSecKey](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_MacSecKey.html#DX-Type-MacSecKey-state) for descriptions of each state.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MacsecKeyAssociationState.__new__(_MacsecKeyAssociationState)

        __props__.__dict__["cak"] = cak
        __props__.__dict__["ckn"] = ckn
        __props__.__dict__["connection_id"] = connection_id
        __props__.__dict__["secret_arn"] = secret_arn
        __props__.__dict__["start_on"] = start_on
        __props__.__dict__["state"] = state
        return MacsecKeyAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def cak(self) -> pulumi.Output[Optional[str]]:
        """
        The MAC Security (MACsec) CAK to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `ckn`.
        """
        return pulumi.get(self, "cak")

    @property
    @pulumi.getter
    def ckn(self) -> pulumi.Output[str]:
        """
        The MAC Security (MACsec) CKN to associate with the dedicated connection. The valid values are 64 hexadecimal characters (0-9, A-E). Required if using `cak`.
        """
        return pulumi.get(self, "ckn")

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Output[str]:
        """
        The ID of the dedicated Direct Connect connection. The connection must be a dedicated connection in the `AVAILABLE` state.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="secretArn")
    def secret_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key to associate with the dedicated connection.

        > **Note:** `ckn` and `cak` are mutually exclusive with `secret_arn` - these arguments cannot be used together. If you use `ckn` and `cak`, you should not use `secret_arn`. If you use the `secret_arn` argument to reference an existing MAC Security (MACSec) secret key, you should not use `ckn` or `cak`.
        """
        return pulumi.get(self, "secret_arn")

    @property
    @pulumi.getter(name="startOn")
    def start_on(self) -> pulumi.Output[str]:
        """
        The date in UTC format that the MAC Security (MACsec) secret key takes effect.
        """
        return pulumi.get(self, "start_on")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The state of the MAC Security (MACsec) secret key. The possible values are: associating, associated, disassociating, disassociated. See [MacSecKey](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_MacSecKey.html#DX-Type-MacSecKey-state) for descriptions of each state.
        """
        return pulumi.get(self, "state")

