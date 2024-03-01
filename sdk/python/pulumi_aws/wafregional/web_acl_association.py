# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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
                 web_acl_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a WebAclAssociation resource.
        :param pulumi.Input[str] resource_arn: ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
        :param pulumi.Input[str] web_acl_id: The ID of the WAF Regional WebACL to create an association.
        """
        pulumi.set(__self__, "resource_arn", resource_arn)
        pulumi.set(__self__, "web_acl_id", web_acl_id)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Input[str]:
        """
        ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter(name="webAclId")
    def web_acl_id(self) -> pulumi.Input[str]:
        """
        The ID of the WAF Regional WebACL to create an association.
        """
        return pulumi.get(self, "web_acl_id")

    @web_acl_id.setter
    def web_acl_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "web_acl_id", value)


@pulumi.input_type
class _WebAclAssociationState:
    def __init__(__self__, *,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 web_acl_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WebAclAssociation resources.
        :param pulumi.Input[str] resource_arn: ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
        :param pulumi.Input[str] web_acl_id: The ID of the WAF Regional WebACL to create an association.
        """
        if resource_arn is not None:
            pulumi.set(__self__, "resource_arn", resource_arn)
        if web_acl_id is not None:
            pulumi.set(__self__, "web_acl_id", web_acl_id)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter(name="webAclId")
    def web_acl_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the WAF Regional WebACL to create an association.
        """
        return pulumi.get(self, "web_acl_id")

    @web_acl_id.setter
    def web_acl_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "web_acl_id", value)


class WebAclAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 web_acl_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an association with WAF Regional Web ACL.

        > **Note:** An Application Load Balancer can only be associated with one WAF Regional WebACL.

        ## Example Usage
        ### Application Load Balancer Association

        ```python
        import pulumi
        import pulumi_aws as aws

        ipset = aws.wafregional.IpSet("ipset",
            name="tfIPSet",
            ip_set_descriptors=[aws.wafregional.IpSetIpSetDescriptorArgs(
                type="IPV4",
                value="192.0.7.0/24",
            )])
        foo = aws.wafregional.Rule("foo",
            name="tfWAFRule",
            metric_name="tfWAFRule",
            predicates=[aws.wafregional.RulePredicateArgs(
                data_id=ipset.id,
                negated=False,
                type="IPMatch",
            )])
        foo_web_acl = aws.wafregional.WebAcl("foo",
            name="foo",
            metric_name="foo",
            default_action=aws.wafregional.WebAclDefaultActionArgs(
                type="ALLOW",
            ),
            rules=[aws.wafregional.WebAclRuleArgs(
                action=aws.wafregional.WebAclRuleActionArgs(
                    type="BLOCK",
                ),
                priority=1,
                rule_id=foo.id,
            )])
        foo_vpc = aws.ec2.Vpc("foo", cidr_block="10.1.0.0/16")
        available = aws.get_availability_zones()
        foo_subnet = aws.ec2.Subnet("foo",
            vpc_id=foo_vpc.id,
            cidr_block="10.1.1.0/24",
            availability_zone=available.names[0])
        bar = aws.ec2.Subnet("bar",
            vpc_id=foo_vpc.id,
            cidr_block="10.1.2.0/24",
            availability_zone=available.names[1])
        foo_load_balancer = aws.alb.LoadBalancer("foo",
            internal=True,
            subnets=[
                foo_subnet.id,
                bar.id,
            ])
        foo_web_acl_association = aws.wafregional.WebAclAssociation("foo",
            resource_arn=foo_load_balancer.arn,
            web_acl_id=foo_web_acl.id)
        ```
        ### API Gateway Association

        ```python
        import pulumi
        import json
        import pulumi_aws as aws
        import pulumi_std as std

        ipset = aws.wafregional.IpSet("ipset",
            name="tfIPSet",
            ip_set_descriptors=[aws.wafregional.IpSetIpSetDescriptorArgs(
                type="IPV4",
                value="192.0.7.0/24",
            )])
        foo = aws.wafregional.Rule("foo",
            name="tfWAFRule",
            metric_name="tfWAFRule",
            predicates=[aws.wafregional.RulePredicateArgs(
                data_id=ipset.id,
                negated=False,
                type="IPMatch",
            )])
        foo_web_acl = aws.wafregional.WebAcl("foo",
            name="foo",
            metric_name="foo",
            default_action=aws.wafregional.WebAclDefaultActionArgs(
                type="ALLOW",
            ),
            rules=[aws.wafregional.WebAclRuleArgs(
                action=aws.wafregional.WebAclRuleActionArgs(
                    type="BLOCK",
                ),
                priority=1,
                rule_id=foo.id,
            )])
        example = aws.apigateway.RestApi("example",
            body=json.dumps({
                "openapi": "3.0.1",
                "info": {
                    "title": "example",
                    "version": "1.0",
                },
                "paths": {
                    "/path1": {
                        "get": {
                            "x-amazon-apigateway-integration": {
                                "httpMethod": "GET",
                                "payloadFormatVersion": "1.0",
                                "type": "HTTP_PROXY",
                                "uri": "https://ip-ranges.amazonaws.com/ip-ranges.json",
                            },
                        },
                    },
                },
            }),
            name="example")
        example_deployment = aws.apigateway.Deployment("example",
            rest_api=example.id,
            triggers={
                "redeployment": std.sha1_output(input=pulumi.Output.json_dumps(example.body)).apply(lambda invoke: invoke.result),
            })
        example_stage = aws.apigateway.Stage("example",
            deployment=example_deployment.id,
            rest_api=example.id,
            stage_name="example")
        association = aws.wafregional.WebAclAssociation("association",
            resource_arn=example_stage.arn,
            web_acl_id=foo_web_acl.id)
        ```

        ## Import

        Using `pulumi import`, import WAF Regional Web ACL Association using their `web_acl_id:resource_arn`. For example:

        ```sh
         $ pulumi import aws:wafregional/webAclAssociation:WebAclAssociation foo web_acl_id:resource_arn
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] resource_arn: ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
        :param pulumi.Input[str] web_acl_id: The ID of the WAF Regional WebACL to create an association.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebAclAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an association with WAF Regional Web ACL.

        > **Note:** An Application Load Balancer can only be associated with one WAF Regional WebACL.

        ## Example Usage
        ### Application Load Balancer Association

        ```python
        import pulumi
        import pulumi_aws as aws

        ipset = aws.wafregional.IpSet("ipset",
            name="tfIPSet",
            ip_set_descriptors=[aws.wafregional.IpSetIpSetDescriptorArgs(
                type="IPV4",
                value="192.0.7.0/24",
            )])
        foo = aws.wafregional.Rule("foo",
            name="tfWAFRule",
            metric_name="tfWAFRule",
            predicates=[aws.wafregional.RulePredicateArgs(
                data_id=ipset.id,
                negated=False,
                type="IPMatch",
            )])
        foo_web_acl = aws.wafregional.WebAcl("foo",
            name="foo",
            metric_name="foo",
            default_action=aws.wafregional.WebAclDefaultActionArgs(
                type="ALLOW",
            ),
            rules=[aws.wafregional.WebAclRuleArgs(
                action=aws.wafregional.WebAclRuleActionArgs(
                    type="BLOCK",
                ),
                priority=1,
                rule_id=foo.id,
            )])
        foo_vpc = aws.ec2.Vpc("foo", cidr_block="10.1.0.0/16")
        available = aws.get_availability_zones()
        foo_subnet = aws.ec2.Subnet("foo",
            vpc_id=foo_vpc.id,
            cidr_block="10.1.1.0/24",
            availability_zone=available.names[0])
        bar = aws.ec2.Subnet("bar",
            vpc_id=foo_vpc.id,
            cidr_block="10.1.2.0/24",
            availability_zone=available.names[1])
        foo_load_balancer = aws.alb.LoadBalancer("foo",
            internal=True,
            subnets=[
                foo_subnet.id,
                bar.id,
            ])
        foo_web_acl_association = aws.wafregional.WebAclAssociation("foo",
            resource_arn=foo_load_balancer.arn,
            web_acl_id=foo_web_acl.id)
        ```
        ### API Gateway Association

        ```python
        import pulumi
        import json
        import pulumi_aws as aws
        import pulumi_std as std

        ipset = aws.wafregional.IpSet("ipset",
            name="tfIPSet",
            ip_set_descriptors=[aws.wafregional.IpSetIpSetDescriptorArgs(
                type="IPV4",
                value="192.0.7.0/24",
            )])
        foo = aws.wafregional.Rule("foo",
            name="tfWAFRule",
            metric_name="tfWAFRule",
            predicates=[aws.wafregional.RulePredicateArgs(
                data_id=ipset.id,
                negated=False,
                type="IPMatch",
            )])
        foo_web_acl = aws.wafregional.WebAcl("foo",
            name="foo",
            metric_name="foo",
            default_action=aws.wafregional.WebAclDefaultActionArgs(
                type="ALLOW",
            ),
            rules=[aws.wafregional.WebAclRuleArgs(
                action=aws.wafregional.WebAclRuleActionArgs(
                    type="BLOCK",
                ),
                priority=1,
                rule_id=foo.id,
            )])
        example = aws.apigateway.RestApi("example",
            body=json.dumps({
                "openapi": "3.0.1",
                "info": {
                    "title": "example",
                    "version": "1.0",
                },
                "paths": {
                    "/path1": {
                        "get": {
                            "x-amazon-apigateway-integration": {
                                "httpMethod": "GET",
                                "payloadFormatVersion": "1.0",
                                "type": "HTTP_PROXY",
                                "uri": "https://ip-ranges.amazonaws.com/ip-ranges.json",
                            },
                        },
                    },
                },
            }),
            name="example")
        example_deployment = aws.apigateway.Deployment("example",
            rest_api=example.id,
            triggers={
                "redeployment": std.sha1_output(input=pulumi.Output.json_dumps(example.body)).apply(lambda invoke: invoke.result),
            })
        example_stage = aws.apigateway.Stage("example",
            deployment=example_deployment.id,
            rest_api=example.id,
            stage_name="example")
        association = aws.wafregional.WebAclAssociation("association",
            resource_arn=example_stage.arn,
            web_acl_id=foo_web_acl.id)
        ```

        ## Import

        Using `pulumi import`, import WAF Regional Web ACL Association using their `web_acl_id:resource_arn`. For example:

        ```sh
         $ pulumi import aws:wafregional/webAclAssociation:WebAclAssociation foo web_acl_id:resource_arn
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
                 web_acl_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebAclAssociationArgs.__new__(WebAclAssociationArgs)

            if resource_arn is None and not opts.urn:
                raise TypeError("Missing required property 'resource_arn'")
            __props__.__dict__["resource_arn"] = resource_arn
            if web_acl_id is None and not opts.urn:
                raise TypeError("Missing required property 'web_acl_id'")
            __props__.__dict__["web_acl_id"] = web_acl_id
        super(WebAclAssociation, __self__).__init__(
            'aws:wafregional/webAclAssociation:WebAclAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            resource_arn: Optional[pulumi.Input[str]] = None,
            web_acl_id: Optional[pulumi.Input[str]] = None) -> 'WebAclAssociation':
        """
        Get an existing WebAclAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] resource_arn: ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
        :param pulumi.Input[str] web_acl_id: The ID of the WAF Regional WebACL to create an association.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebAclAssociationState.__new__(_WebAclAssociationState)

        __props__.__dict__["resource_arn"] = resource_arn
        __props__.__dict__["web_acl_id"] = web_acl_id
        return WebAclAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Output[str]:
        """
        ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
        """
        return pulumi.get(self, "resource_arn")

    @property
    @pulumi.getter(name="webAclId")
    def web_acl_id(self) -> pulumi.Output[str]:
        """
        The ID of the WAF Regional WebACL to create an association.
        """
        return pulumi.get(self, "web_acl_id")

