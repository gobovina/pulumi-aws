# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ResponseHeadersPolicyArgs', 'ResponseHeadersPolicy']

@pulumi.input_type
class ResponseHeadersPolicyArgs:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 cors_config: Optional[pulumi.Input['ResponseHeadersPolicyCorsConfigArgs']] = None,
                 custom_headers_config: Optional[pulumi.Input['ResponseHeadersPolicyCustomHeadersConfigArgs']] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 remove_headers_config: Optional[pulumi.Input['ResponseHeadersPolicyRemoveHeadersConfigArgs']] = None,
                 security_headers_config: Optional[pulumi.Input['ResponseHeadersPolicySecurityHeadersConfigArgs']] = None,
                 server_timing_headers_config: Optional[pulumi.Input['ResponseHeadersPolicyServerTimingHeadersConfigArgs']] = None):
        """
        The set of arguments for constructing a ResponseHeadersPolicy resource.
        :param pulumi.Input[str] comment: A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
        :param pulumi.Input['ResponseHeadersPolicyCorsConfigArgs'] cors_config: A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
        :param pulumi.Input['ResponseHeadersPolicyCustomHeadersConfigArgs'] custom_headers_config: Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
        :param pulumi.Input[str] etag: The current version of the response headers policy.
        :param pulumi.Input[str] name: A unique name to identify the response headers policy.
        :param pulumi.Input['ResponseHeadersPolicyRemoveHeadersConfigArgs'] remove_headers_config: A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
        :param pulumi.Input['ResponseHeadersPolicySecurityHeadersConfigArgs'] security_headers_config: A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
        :param pulumi.Input['ResponseHeadersPolicyServerTimingHeadersConfigArgs'] server_timing_headers_config: A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if cors_config is not None:
            pulumi.set(__self__, "cors_config", cors_config)
        if custom_headers_config is not None:
            pulumi.set(__self__, "custom_headers_config", custom_headers_config)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if remove_headers_config is not None:
            pulumi.set(__self__, "remove_headers_config", remove_headers_config)
        if security_headers_config is not None:
            pulumi.set(__self__, "security_headers_config", security_headers_config)
        if server_timing_headers_config is not None:
            pulumi.set(__self__, "server_timing_headers_config", server_timing_headers_config)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="corsConfig")
    def cors_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicyCorsConfigArgs']]:
        """
        A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
        """
        return pulumi.get(self, "cors_config")

    @cors_config.setter
    def cors_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicyCorsConfigArgs']]):
        pulumi.set(self, "cors_config", value)

    @property
    @pulumi.getter(name="customHeadersConfig")
    def custom_headers_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicyCustomHeadersConfigArgs']]:
        """
        Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
        """
        return pulumi.get(self, "custom_headers_config")

    @custom_headers_config.setter
    def custom_headers_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicyCustomHeadersConfigArgs']]):
        pulumi.set(self, "custom_headers_config", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        """
        The current version of the response headers policy.
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name to identify the response headers policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="removeHeadersConfig")
    def remove_headers_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicyRemoveHeadersConfigArgs']]:
        """
        A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
        """
        return pulumi.get(self, "remove_headers_config")

    @remove_headers_config.setter
    def remove_headers_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicyRemoveHeadersConfigArgs']]):
        pulumi.set(self, "remove_headers_config", value)

    @property
    @pulumi.getter(name="securityHeadersConfig")
    def security_headers_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicySecurityHeadersConfigArgs']]:
        """
        A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
        """
        return pulumi.get(self, "security_headers_config")

    @security_headers_config.setter
    def security_headers_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicySecurityHeadersConfigArgs']]):
        pulumi.set(self, "security_headers_config", value)

    @property
    @pulumi.getter(name="serverTimingHeadersConfig")
    def server_timing_headers_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicyServerTimingHeadersConfigArgs']]:
        """
        A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
        """
        return pulumi.get(self, "server_timing_headers_config")

    @server_timing_headers_config.setter
    def server_timing_headers_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicyServerTimingHeadersConfigArgs']]):
        pulumi.set(self, "server_timing_headers_config", value)


@pulumi.input_type
class _ResponseHeadersPolicyState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 cors_config: Optional[pulumi.Input['ResponseHeadersPolicyCorsConfigArgs']] = None,
                 custom_headers_config: Optional[pulumi.Input['ResponseHeadersPolicyCustomHeadersConfigArgs']] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 remove_headers_config: Optional[pulumi.Input['ResponseHeadersPolicyRemoveHeadersConfigArgs']] = None,
                 security_headers_config: Optional[pulumi.Input['ResponseHeadersPolicySecurityHeadersConfigArgs']] = None,
                 server_timing_headers_config: Optional[pulumi.Input['ResponseHeadersPolicyServerTimingHeadersConfigArgs']] = None):
        """
        Input properties used for looking up and filtering ResponseHeadersPolicy resources.
        :param pulumi.Input[str] comment: A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
        :param pulumi.Input['ResponseHeadersPolicyCorsConfigArgs'] cors_config: A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
        :param pulumi.Input['ResponseHeadersPolicyCustomHeadersConfigArgs'] custom_headers_config: Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
        :param pulumi.Input[str] etag: The current version of the response headers policy.
        :param pulumi.Input[str] name: A unique name to identify the response headers policy.
        :param pulumi.Input['ResponseHeadersPolicyRemoveHeadersConfigArgs'] remove_headers_config: A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
        :param pulumi.Input['ResponseHeadersPolicySecurityHeadersConfigArgs'] security_headers_config: A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
        :param pulumi.Input['ResponseHeadersPolicyServerTimingHeadersConfigArgs'] server_timing_headers_config: A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if cors_config is not None:
            pulumi.set(__self__, "cors_config", cors_config)
        if custom_headers_config is not None:
            pulumi.set(__self__, "custom_headers_config", custom_headers_config)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if remove_headers_config is not None:
            pulumi.set(__self__, "remove_headers_config", remove_headers_config)
        if security_headers_config is not None:
            pulumi.set(__self__, "security_headers_config", security_headers_config)
        if server_timing_headers_config is not None:
            pulumi.set(__self__, "server_timing_headers_config", server_timing_headers_config)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="corsConfig")
    def cors_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicyCorsConfigArgs']]:
        """
        A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
        """
        return pulumi.get(self, "cors_config")

    @cors_config.setter
    def cors_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicyCorsConfigArgs']]):
        pulumi.set(self, "cors_config", value)

    @property
    @pulumi.getter(name="customHeadersConfig")
    def custom_headers_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicyCustomHeadersConfigArgs']]:
        """
        Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
        """
        return pulumi.get(self, "custom_headers_config")

    @custom_headers_config.setter
    def custom_headers_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicyCustomHeadersConfigArgs']]):
        pulumi.set(self, "custom_headers_config", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        """
        The current version of the response headers policy.
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name to identify the response headers policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="removeHeadersConfig")
    def remove_headers_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicyRemoveHeadersConfigArgs']]:
        """
        A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
        """
        return pulumi.get(self, "remove_headers_config")

    @remove_headers_config.setter
    def remove_headers_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicyRemoveHeadersConfigArgs']]):
        pulumi.set(self, "remove_headers_config", value)

    @property
    @pulumi.getter(name="securityHeadersConfig")
    def security_headers_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicySecurityHeadersConfigArgs']]:
        """
        A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
        """
        return pulumi.get(self, "security_headers_config")

    @security_headers_config.setter
    def security_headers_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicySecurityHeadersConfigArgs']]):
        pulumi.set(self, "security_headers_config", value)

    @property
    @pulumi.getter(name="serverTimingHeadersConfig")
    def server_timing_headers_config(self) -> Optional[pulumi.Input['ResponseHeadersPolicyServerTimingHeadersConfigArgs']]:
        """
        A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
        """
        return pulumi.get(self, "server_timing_headers_config")

    @server_timing_headers_config.setter
    def server_timing_headers_config(self, value: Optional[pulumi.Input['ResponseHeadersPolicyServerTimingHeadersConfigArgs']]):
        pulumi.set(self, "server_timing_headers_config", value)


class ResponseHeadersPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 cors_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCorsConfigArgs']]] = None,
                 custom_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCustomHeadersConfigArgs']]] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 remove_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyRemoveHeadersConfigArgs']]] = None,
                 security_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicySecurityHeadersConfigArgs']]] = None,
                 server_timing_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyServerTimingHeadersConfigArgs']]] = None,
                 __props__=None):
        """
        Provides a CloudFront response headers policy resource.
        A response headers policy contains information about a set of HTTP response headers and their values.
        After you create a response headers policy, you can use its ID to attach it to one or more cache behaviors in a CloudFront distribution.
        When it’s attached to a cache behavior, CloudFront adds the headers in the policy to every response that it sends for requests that match the cache behavior.

        ## Example Usage

        The example below creates a CloudFront response headers policy.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.cloudfront.ResponseHeadersPolicy("example",
            comment="test comment",
            cors_config=aws.cloudfront.ResponseHeadersPolicyCorsConfigArgs(
                access_control_allow_credentials=True,
                access_control_allow_headers=aws.cloudfront.ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs(
                    items=["test"],
                ),
                access_control_allow_methods=aws.cloudfront.ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs(
                    items=["GET"],
                ),
                access_control_allow_origins=aws.cloudfront.ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs(
                    items=["test.example.comtest"],
                ),
                origin_override=True,
            ))
        ```

        The example below creates a CloudFront response headers policy with a custom headers config.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.cloudfront.ResponseHeadersPolicy("example", custom_headers_config=aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigArgs(
            items=[
                aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigItemArgs(
                    header="X-Permitted-Cross-Domain-Policies",
                    override=True,
                    value="none",
                ),
                aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigItemArgs(
                    header="X-Test",
                    override=True,
                    value="none",
                ),
            ],
        ))
        ```

        The example below creates a CloudFront response headers policy with a custom headers config and server timing headers config.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.cloudfront.ResponseHeadersPolicy("example",
            custom_headers_config=aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigArgs(
                items=[aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigItemArgs(
                    header="X-Permitted-Cross-Domain-Policies",
                    override=True,
                    value="none",
                )],
            ),
            server_timing_headers_config=aws.cloudfront.ResponseHeadersPolicyServerTimingHeadersConfigArgs(
                enabled=True,
                sampling_rate=50,
            ))
        ```

        ## Import

        Using `pulumi import`, import Cloudfront Response Headers Policies using the `id`. For example:

        ```sh
         $ pulumi import aws:cloudfront/responseHeadersPolicy:ResponseHeadersPolicy policy 658327ea-f89d-4fab-a63d-7e88639e58f9
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCorsConfigArgs']] cors_config: A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCustomHeadersConfigArgs']] custom_headers_config: Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
        :param pulumi.Input[str] etag: The current version of the response headers policy.
        :param pulumi.Input[str] name: A unique name to identify the response headers policy.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicyRemoveHeadersConfigArgs']] remove_headers_config: A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicySecurityHeadersConfigArgs']] security_headers_config: A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicyServerTimingHeadersConfigArgs']] server_timing_headers_config: A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ResponseHeadersPolicyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CloudFront response headers policy resource.
        A response headers policy contains information about a set of HTTP response headers and their values.
        After you create a response headers policy, you can use its ID to attach it to one or more cache behaviors in a CloudFront distribution.
        When it’s attached to a cache behavior, CloudFront adds the headers in the policy to every response that it sends for requests that match the cache behavior.

        ## Example Usage

        The example below creates a CloudFront response headers policy.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.cloudfront.ResponseHeadersPolicy("example",
            comment="test comment",
            cors_config=aws.cloudfront.ResponseHeadersPolicyCorsConfigArgs(
                access_control_allow_credentials=True,
                access_control_allow_headers=aws.cloudfront.ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs(
                    items=["test"],
                ),
                access_control_allow_methods=aws.cloudfront.ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs(
                    items=["GET"],
                ),
                access_control_allow_origins=aws.cloudfront.ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs(
                    items=["test.example.comtest"],
                ),
                origin_override=True,
            ))
        ```

        The example below creates a CloudFront response headers policy with a custom headers config.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.cloudfront.ResponseHeadersPolicy("example", custom_headers_config=aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigArgs(
            items=[
                aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigItemArgs(
                    header="X-Permitted-Cross-Domain-Policies",
                    override=True,
                    value="none",
                ),
                aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigItemArgs(
                    header="X-Test",
                    override=True,
                    value="none",
                ),
            ],
        ))
        ```

        The example below creates a CloudFront response headers policy with a custom headers config and server timing headers config.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.cloudfront.ResponseHeadersPolicy("example",
            custom_headers_config=aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigArgs(
                items=[aws.cloudfront.ResponseHeadersPolicyCustomHeadersConfigItemArgs(
                    header="X-Permitted-Cross-Domain-Policies",
                    override=True,
                    value="none",
                )],
            ),
            server_timing_headers_config=aws.cloudfront.ResponseHeadersPolicyServerTimingHeadersConfigArgs(
                enabled=True,
                sampling_rate=50,
            ))
        ```

        ## Import

        Using `pulumi import`, import Cloudfront Response Headers Policies using the `id`. For example:

        ```sh
         $ pulumi import aws:cloudfront/responseHeadersPolicy:ResponseHeadersPolicy policy 658327ea-f89d-4fab-a63d-7e88639e58f9
        ```

        :param str resource_name: The name of the resource.
        :param ResponseHeadersPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResponseHeadersPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 cors_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCorsConfigArgs']]] = None,
                 custom_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCustomHeadersConfigArgs']]] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 remove_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyRemoveHeadersConfigArgs']]] = None,
                 security_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicySecurityHeadersConfigArgs']]] = None,
                 server_timing_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyServerTimingHeadersConfigArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResponseHeadersPolicyArgs.__new__(ResponseHeadersPolicyArgs)

            __props__.__dict__["comment"] = comment
            __props__.__dict__["cors_config"] = cors_config
            __props__.__dict__["custom_headers_config"] = custom_headers_config
            __props__.__dict__["etag"] = etag
            __props__.__dict__["name"] = name
            __props__.__dict__["remove_headers_config"] = remove_headers_config
            __props__.__dict__["security_headers_config"] = security_headers_config
            __props__.__dict__["server_timing_headers_config"] = server_timing_headers_config
        super(ResponseHeadersPolicy, __self__).__init__(
            'aws:cloudfront/responseHeadersPolicy:ResponseHeadersPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            cors_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCorsConfigArgs']]] = None,
            custom_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCustomHeadersConfigArgs']]] = None,
            etag: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            remove_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyRemoveHeadersConfigArgs']]] = None,
            security_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicySecurityHeadersConfigArgs']]] = None,
            server_timing_headers_config: Optional[pulumi.Input[pulumi.InputType['ResponseHeadersPolicyServerTimingHeadersConfigArgs']]] = None) -> 'ResponseHeadersPolicy':
        """
        Get an existing ResponseHeadersPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCorsConfigArgs']] cors_config: A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicyCustomHeadersConfigArgs']] custom_headers_config: Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
        :param pulumi.Input[str] etag: The current version of the response headers policy.
        :param pulumi.Input[str] name: A unique name to identify the response headers policy.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicyRemoveHeadersConfigArgs']] remove_headers_config: A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicySecurityHeadersConfigArgs']] security_headers_config: A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
        :param pulumi.Input[pulumi.InputType['ResponseHeadersPolicyServerTimingHeadersConfigArgs']] server_timing_headers_config: A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResponseHeadersPolicyState.__new__(_ResponseHeadersPolicyState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["cors_config"] = cors_config
        __props__.__dict__["custom_headers_config"] = custom_headers_config
        __props__.__dict__["etag"] = etag
        __props__.__dict__["name"] = name
        __props__.__dict__["remove_headers_config"] = remove_headers_config
        __props__.__dict__["security_headers_config"] = security_headers_config
        __props__.__dict__["server_timing_headers_config"] = server_timing_headers_config
        return ResponseHeadersPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="corsConfig")
    def cors_config(self) -> pulumi.Output[Optional['outputs.ResponseHeadersPolicyCorsConfig']]:
        """
        A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
        """
        return pulumi.get(self, "cors_config")

    @property
    @pulumi.getter(name="customHeadersConfig")
    def custom_headers_config(self) -> pulumi.Output[Optional['outputs.ResponseHeadersPolicyCustomHeadersConfig']]:
        """
        Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
        """
        return pulumi.get(self, "custom_headers_config")

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        """
        The current version of the response headers policy.
        """
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A unique name to identify the response headers policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="removeHeadersConfig")
    def remove_headers_config(self) -> pulumi.Output[Optional['outputs.ResponseHeadersPolicyRemoveHeadersConfig']]:
        """
        A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
        """
        return pulumi.get(self, "remove_headers_config")

    @property
    @pulumi.getter(name="securityHeadersConfig")
    def security_headers_config(self) -> pulumi.Output[Optional['outputs.ResponseHeadersPolicySecurityHeadersConfig']]:
        """
        A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
        """
        return pulumi.get(self, "security_headers_config")

    @property
    @pulumi.getter(name="serverTimingHeadersConfig")
    def server_timing_headers_config(self) -> pulumi.Output[Optional['outputs.ResponseHeadersPolicyServerTimingHeadersConfig']]:
        """
        A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
        """
        return pulumi.get(self, "server_timing_headers_config")

