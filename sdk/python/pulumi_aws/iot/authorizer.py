# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AuthorizerArgs', 'Authorizer']

@pulumi.input_type
class AuthorizerArgs:
    def __init__(__self__, *,
                 authorizer_function_arn: pulumi.Input[str],
                 enable_caching_for_http: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 signing_disabled: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 token_key_name: Optional[pulumi.Input[str]] = None,
                 token_signing_public_keys: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Authorizer resource.
        :param pulumi.Input[str] authorizer_function_arn: The ARN of the authorizer's Lambda function.
        :param pulumi.Input[bool] enable_caching_for_http: Specifies whether the HTTP caching is enabled or not. Default: `false`.
        :param pulumi.Input[str] name: The name of the authorizer.
        :param pulumi.Input[bool] signing_disabled: Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
        :param pulumi.Input[str] status: The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
        :param pulumi.Input[str] token_key_name: The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] token_signing_public_keys: The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
        """
        pulumi.set(__self__, "authorizer_function_arn", authorizer_function_arn)
        if enable_caching_for_http is not None:
            pulumi.set(__self__, "enable_caching_for_http", enable_caching_for_http)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if signing_disabled is not None:
            pulumi.set(__self__, "signing_disabled", signing_disabled)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if token_key_name is not None:
            pulumi.set(__self__, "token_key_name", token_key_name)
        if token_signing_public_keys is not None:
            pulumi.set(__self__, "token_signing_public_keys", token_signing_public_keys)

    @property
    @pulumi.getter(name="authorizerFunctionArn")
    def authorizer_function_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the authorizer's Lambda function.
        """
        return pulumi.get(self, "authorizer_function_arn")

    @authorizer_function_arn.setter
    def authorizer_function_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "authorizer_function_arn", value)

    @property
    @pulumi.getter(name="enableCachingForHttp")
    def enable_caching_for_http(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the HTTP caching is enabled or not. Default: `false`.
        """
        return pulumi.get(self, "enable_caching_for_http")

    @enable_caching_for_http.setter
    def enable_caching_for_http(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_caching_for_http", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the authorizer.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="signingDisabled")
    def signing_disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
        """
        return pulumi.get(self, "signing_disabled")

    @signing_disabled.setter
    def signing_disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "signing_disabled", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="tokenKeyName")
    def token_key_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
        """
        return pulumi.get(self, "token_key_name")

    @token_key_name.setter
    def token_key_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_key_name", value)

    @property
    @pulumi.getter(name="tokenSigningPublicKeys")
    def token_signing_public_keys(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
        """
        return pulumi.get(self, "token_signing_public_keys")

    @token_signing_public_keys.setter
    def token_signing_public_keys(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "token_signing_public_keys", value)


@pulumi.input_type
class _AuthorizerState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 authorizer_function_arn: Optional[pulumi.Input[str]] = None,
                 enable_caching_for_http: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 signing_disabled: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 token_key_name: Optional[pulumi.Input[str]] = None,
                 token_signing_public_keys: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Authorizer resources.
        :param pulumi.Input[str] arn: The ARN of the authorizer.
        :param pulumi.Input[str] authorizer_function_arn: The ARN of the authorizer's Lambda function.
        :param pulumi.Input[bool] enable_caching_for_http: Specifies whether the HTTP caching is enabled or not. Default: `false`.
        :param pulumi.Input[str] name: The name of the authorizer.
        :param pulumi.Input[bool] signing_disabled: Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
        :param pulumi.Input[str] status: The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
        :param pulumi.Input[str] token_key_name: The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] token_signing_public_keys: The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if authorizer_function_arn is not None:
            pulumi.set(__self__, "authorizer_function_arn", authorizer_function_arn)
        if enable_caching_for_http is not None:
            pulumi.set(__self__, "enable_caching_for_http", enable_caching_for_http)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if signing_disabled is not None:
            pulumi.set(__self__, "signing_disabled", signing_disabled)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if token_key_name is not None:
            pulumi.set(__self__, "token_key_name", token_key_name)
        if token_signing_public_keys is not None:
            pulumi.set(__self__, "token_signing_public_keys", token_signing_public_keys)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the authorizer.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="authorizerFunctionArn")
    def authorizer_function_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the authorizer's Lambda function.
        """
        return pulumi.get(self, "authorizer_function_arn")

    @authorizer_function_arn.setter
    def authorizer_function_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authorizer_function_arn", value)

    @property
    @pulumi.getter(name="enableCachingForHttp")
    def enable_caching_for_http(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the HTTP caching is enabled or not. Default: `false`.
        """
        return pulumi.get(self, "enable_caching_for_http")

    @enable_caching_for_http.setter
    def enable_caching_for_http(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_caching_for_http", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the authorizer.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="signingDisabled")
    def signing_disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
        """
        return pulumi.get(self, "signing_disabled")

    @signing_disabled.setter
    def signing_disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "signing_disabled", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="tokenKeyName")
    def token_key_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
        """
        return pulumi.get(self, "token_key_name")

    @token_key_name.setter
    def token_key_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_key_name", value)

    @property
    @pulumi.getter(name="tokenSigningPublicKeys")
    def token_signing_public_keys(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
        """
        return pulumi.get(self, "token_signing_public_keys")

    @token_signing_public_keys.setter
    def token_signing_public_keys(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "token_signing_public_keys", value)


class Authorizer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorizer_function_arn: Optional[pulumi.Input[str]] = None,
                 enable_caching_for_http: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 signing_disabled: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 token_key_name: Optional[pulumi.Input[str]] = None,
                 token_signing_public_keys: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Creates and manages an AWS IoT Authorizer.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.Authorizer("example",
            authorizer_function_arn=aws_lambda_function["example"]["arn"],
            signing_disabled=False,
            status="ACTIVE",
            token_key_name="Token-Header",
            token_signing_public_keys={
                "Key1": (lambda path: open(path).read())("test-fixtures/iot-authorizer-signing-key.pem"),
            })
        ```

        ## Import

        Using `pulumi import`, import IOT Authorizers using the name. For example:

        ```sh
         $ pulumi import aws:iot/authorizer:Authorizer example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authorizer_function_arn: The ARN of the authorizer's Lambda function.
        :param pulumi.Input[bool] enable_caching_for_http: Specifies whether the HTTP caching is enabled or not. Default: `false`.
        :param pulumi.Input[str] name: The name of the authorizer.
        :param pulumi.Input[bool] signing_disabled: Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
        :param pulumi.Input[str] status: The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
        :param pulumi.Input[str] token_key_name: The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] token_signing_public_keys: The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthorizerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages an AWS IoT Authorizer.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.Authorizer("example",
            authorizer_function_arn=aws_lambda_function["example"]["arn"],
            signing_disabled=False,
            status="ACTIVE",
            token_key_name="Token-Header",
            token_signing_public_keys={
                "Key1": (lambda path: open(path).read())("test-fixtures/iot-authorizer-signing-key.pem"),
            })
        ```

        ## Import

        Using `pulumi import`, import IOT Authorizers using the name. For example:

        ```sh
         $ pulumi import aws:iot/authorizer:Authorizer example example
        ```

        :param str resource_name: The name of the resource.
        :param AuthorizerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthorizerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorizer_function_arn: Optional[pulumi.Input[str]] = None,
                 enable_caching_for_http: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 signing_disabled: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 token_key_name: Optional[pulumi.Input[str]] = None,
                 token_signing_public_keys: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthorizerArgs.__new__(AuthorizerArgs)

            if authorizer_function_arn is None and not opts.urn:
                raise TypeError("Missing required property 'authorizer_function_arn'")
            __props__.__dict__["authorizer_function_arn"] = authorizer_function_arn
            __props__.__dict__["enable_caching_for_http"] = enable_caching_for_http
            __props__.__dict__["name"] = name
            __props__.__dict__["signing_disabled"] = signing_disabled
            __props__.__dict__["status"] = status
            __props__.__dict__["token_key_name"] = token_key_name
            __props__.__dict__["token_signing_public_keys"] = None if token_signing_public_keys is None else pulumi.Output.secret(token_signing_public_keys)
            __props__.__dict__["arn"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["tokenSigningPublicKeys"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Authorizer, __self__).__init__(
            'aws:iot/authorizer:Authorizer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            authorizer_function_arn: Optional[pulumi.Input[str]] = None,
            enable_caching_for_http: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            signing_disabled: Optional[pulumi.Input[bool]] = None,
            status: Optional[pulumi.Input[str]] = None,
            token_key_name: Optional[pulumi.Input[str]] = None,
            token_signing_public_keys: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Authorizer':
        """
        Get an existing Authorizer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the authorizer.
        :param pulumi.Input[str] authorizer_function_arn: The ARN of the authorizer's Lambda function.
        :param pulumi.Input[bool] enable_caching_for_http: Specifies whether the HTTP caching is enabled or not. Default: `false`.
        :param pulumi.Input[str] name: The name of the authorizer.
        :param pulumi.Input[bool] signing_disabled: Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
        :param pulumi.Input[str] status: The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
        :param pulumi.Input[str] token_key_name: The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] token_signing_public_keys: The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthorizerState.__new__(_AuthorizerState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["authorizer_function_arn"] = authorizer_function_arn
        __props__.__dict__["enable_caching_for_http"] = enable_caching_for_http
        __props__.__dict__["name"] = name
        __props__.__dict__["signing_disabled"] = signing_disabled
        __props__.__dict__["status"] = status
        __props__.__dict__["token_key_name"] = token_key_name
        __props__.__dict__["token_signing_public_keys"] = token_signing_public_keys
        return Authorizer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the authorizer.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="authorizerFunctionArn")
    def authorizer_function_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the authorizer's Lambda function.
        """
        return pulumi.get(self, "authorizer_function_arn")

    @property
    @pulumi.getter(name="enableCachingForHttp")
    def enable_caching_for_http(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the HTTP caching is enabled or not. Default: `false`.
        """
        return pulumi.get(self, "enable_caching_for_http")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the authorizer.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="signingDisabled")
    def signing_disabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
        """
        return pulumi.get(self, "signing_disabled")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        """
        The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="tokenKeyName")
    def token_key_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
        """
        return pulumi.get(self, "token_key_name")

    @property
    @pulumi.getter(name="tokenSigningPublicKeys")
    def token_signing_public_keys(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
        """
        return pulumi.get(self, "token_signing_public_keys")

