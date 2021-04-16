# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['WebAclAssociationArgs', 'WebAclAssociation']

@pulumi.input_type
class WebAclAssociationArgs:
    def __init__(__self__, *,
                 resource_arn: pulumi.Input[str],
                 web_acl_arn: pulumi.Input[str]):
        """
        The set of arguments for constructing a WebAclAssociation resource.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
        :param pulumi.Input[str] web_acl_arn: The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
        """
        pulumi.set(__self__, "resource_arn", resource_arn)
        pulumi.set(__self__, "web_acl_arn", web_acl_arn)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter(name="webAclArn")
    def web_acl_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
        """
        return pulumi.get(self, "web_acl_arn")

    @web_acl_arn.setter
    def web_acl_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "web_acl_arn", value)


@pulumi.input_type
class _WebAclAssociationState:
    def __init__(__self__, *,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 web_acl_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WebAclAssociation resources.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
        :param pulumi.Input[str] web_acl_arn: The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
        """
        if resource_arn is not None:
            pulumi.set(__self__, "resource_arn", resource_arn)
        if web_acl_arn is not None:
            pulumi.set(__self__, "web_acl_arn", web_acl_arn)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter(name="webAclArn")
    def web_acl_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
        """
        return pulumi.get(self, "web_acl_arn")

    @web_acl_arn.setter
    def web_acl_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "web_acl_arn", value)


class WebAclAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 web_acl_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a WAFv2 Web ACL Association.

        > **NOTE on associating a WAFv2 Web ACL with a Cloudfront distribution:** Do not use this resource to associate a WAFv2 Web ACL with a Cloudfront Distribution. The [AWS API call backing this resource](https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html) notes that you should use the [`web_acl_id`][2] property on the [`cloudfront_distribution`][2] instead.

        [1]: https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html
        [2]: https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution.html#web_acl_id

        ## Import

        WAFv2 Web ACL Association can be imported using `WEB_ACL_ARN,RESOURCE_ARN` e.g.

        ```sh
         $ pulumi import aws:wafv2/webAclAssociation:WebAclAssociation example arn:aws:wafv2:...7ce849ea,arn:aws:apigateway:...ages/name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
        :param pulumi.Input[str] web_acl_arn: The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebAclAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a WAFv2 Web ACL Association.

        > **NOTE on associating a WAFv2 Web ACL with a Cloudfront distribution:** Do not use this resource to associate a WAFv2 Web ACL with a Cloudfront Distribution. The [AWS API call backing this resource](https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html) notes that you should use the [`web_acl_id`][2] property on the [`cloudfront_distribution`][2] instead.

        [1]: https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html
        [2]: https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution.html#web_acl_id

        ## Import

        WAFv2 Web ACL Association can be imported using `WEB_ACL_ARN,RESOURCE_ARN` e.g.

        ```sh
         $ pulumi import aws:wafv2/webAclAssociation:WebAclAssociation example arn:aws:wafv2:...7ce849ea,arn:aws:apigateway:...ages/name
        ```

        :param str resource_name: The name of the resource.
        :param WebAclAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebAclAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 web_acl_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebAclAssociationArgs.__new__(WebAclAssociationArgs)

            if resource_arn is None and not opts.urn:
                raise TypeError("Missing required property 'resource_arn'")
            __props__.__dict__["resource_arn"] = resource_arn
            if web_acl_arn is None and not opts.urn:
                raise TypeError("Missing required property 'web_acl_arn'")
            __props__.__dict__["web_acl_arn"] = web_acl_arn
        super(WebAclAssociation, __self__).__init__(
            'aws:wafv2/webAclAssociation:WebAclAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            resource_arn: Optional[pulumi.Input[str]] = None,
            web_acl_arn: Optional[pulumi.Input[str]] = None) -> 'WebAclAssociation':
        """
        Get an existing WebAclAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
        :param pulumi.Input[str] web_acl_arn: The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebAclAssociationState.__new__(_WebAclAssociationState)

        __props__.__dict__["resource_arn"] = resource_arn
        __props__.__dict__["web_acl_arn"] = web_acl_arn
        return WebAclAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
        """
        return pulumi.get(self, "resource_arn")

    @property
    @pulumi.getter(name="webAclArn")
    def web_acl_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
        """
        return pulumi.get(self, "web_acl_arn")

